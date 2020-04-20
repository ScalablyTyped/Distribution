organization := "org.scalablytyped"
name := "vue-rx"
version := "6.2.0-b3df00"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "rxjs" % "6.5.5-62f03a",
  "org.scalablytyped" %%% "rxjs-compat" % "6.5.5-7f568a",
  "org.scalablytyped" %%% "std" % "3.8-9b2470",
  "org.scalablytyped" %%% "vue" % "2.6.11-2e991b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
