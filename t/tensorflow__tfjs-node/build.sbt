organization := "org.scalablytyped"
name := "tensorflow__tfjs-node"
version := "1.2.3-eb95e6"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "std" % "3.5-983486",
  "org.scalablytyped" %%% "tensorflow__tfjs" % "1.2.2-d63bf2",
  "org.scalablytyped" %%% "tensorflow__tfjs-converter" % "1.2.2-819027",
  "org.scalablytyped" %%% "tensorflow__tfjs-core" % "1.2.2-6ffce4",
  "org.scalablytyped" %%% "tensorflow__tfjs-data" % "1.2.2-2cb29d",
  "org.scalablytyped" %%% "tensorflow__tfjs-layers" % "1.2.2-323a54",
  "org.scalablytyped" %%% "webgl2" % "0.0-unknown-dt-20190322Z-5ac356")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        