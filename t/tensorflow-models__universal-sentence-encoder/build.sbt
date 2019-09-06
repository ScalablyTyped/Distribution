organization := "org.scalablytyped"
name := "tensorflow-models__universal-sentence-encoder"
version := "1.1.1-580a05"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "std" % "3.6-c16502",
  "org.scalablytyped" %%% "tensorflow__tfjs-converter" % "1.2.9-30398e",
  "org.scalablytyped" %%% "tensorflow__tfjs-core" % "1.2.9-a33b9b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        