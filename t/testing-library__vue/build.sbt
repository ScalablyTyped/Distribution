organization := "org.scalablytyped"
name := "testing-library__vue"
version := "2.0-dt-20200401Z-b7a67f"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "pretty-format" % "25.3.0-355595",
  "org.scalablytyped" %%% "std" % "3.8-9b2470",
  "org.scalablytyped" %%% "testing-library__dom" % "7.0-dt-20200401Z-940f64",
  "org.scalablytyped" %%% "vue" % "2.6.11-2e991b",
  "org.scalablytyped" %%% "vue-router" % "3.1.6-4cef9b",
  "org.scalablytyped" %%% "vuex" % "3.2.0-c30b96")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
