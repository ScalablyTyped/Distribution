organization := "org.scalablytyped"
name := "tensorflow-models__universal-sentence-encoder"
version := "1.1.1-353d29"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "std" % "3.5-983486",
  "org.scalablytyped" %%% "tensorflow__tfjs-converter" % "1.2.2-819027",
  "org.scalablytyped" %%% "tensorflow__tfjs-core" % "1.2.2-6ffce4",
  "org.scalablytyped" %%% "webgl2" % "0.0-unknown-dt-20190322Z-5ac356")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        