organization := "org.scalablytyped"
name := "tensorflow__tfjs"
version := "1.2.8-7964e1"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "std" % "3.5-cd493c",
  "org.scalablytyped" %%% "tensorflow__tfjs-converter" % "1.2.8-f8fa7a",
  "org.scalablytyped" %%% "tensorflow__tfjs-core" % "1.2.8-0b4e69",
  "org.scalablytyped" %%% "tensorflow__tfjs-data" % "1.2.8-6b856c",
  "org.scalablytyped" %%% "tensorflow__tfjs-layers" % "1.2.8-1667a4",
  "org.scalablytyped" %%% "webgl2" % "0.0-unknown-dt-20190711Z-54dc7a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        