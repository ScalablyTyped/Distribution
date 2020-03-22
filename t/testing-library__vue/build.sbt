organization := "org.scalablytyped"
name := "testing-library__vue"
version := "2.0-dt-20190816Z-08114c"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "pretty-format" % "25.1.0-ffe38d",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "testing-library__dom" % "6.12-dt-20200210Z-0e4de1",
  "org.scalablytyped" %%% "vue" % "2.6.11-d66de9",
  "org.scalablytyped" %%% "vue-router" % "3.1.6-7ba089",
  "org.scalablytyped" %%% "vuex" % "3.1.2-d9ff22")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
