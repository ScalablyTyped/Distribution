organization := "org.scalablytyped"
name := "tensorflow-models__universal-sentence-encoder"
version := "1.2.0-7ab4a4"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "std" % "3.7-953338",
  "org.scalablytyped" %%% "tensorflow__tfjs-converter" % "1.5.1-332c37",
  "org.scalablytyped" %%% "tensorflow__tfjs-core" % "1.5.1-37c365")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        