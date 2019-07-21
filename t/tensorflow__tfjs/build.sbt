organization := "org.scalablytyped"
name := "tensorflow__tfjs"
version := "1.2.3-b5553d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "std" % "3.5-983486",
  "org.scalablytyped" %%% "tensorflow__tfjs-converter" % "1.2.3-161a89",
  "org.scalablytyped" %%% "tensorflow__tfjs-core" % "1.2.3-fecdf1",
  "org.scalablytyped" %%% "tensorflow__tfjs-data" % "1.2.3-d2b97d",
  "org.scalablytyped" %%% "tensorflow__tfjs-layers" % "1.2.3-475491",
  "org.scalablytyped" %%% "webgl2" % "0.0-unknown-dt-20190711Z-742ad4")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        