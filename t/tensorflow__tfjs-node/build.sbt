organization := "org.scalablytyped"
name := "tensorflow__tfjs-node"
version := "1.2.5-cd76ab"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc",
  "org.scalablytyped" %%% "tensorflow__tfjs" % "1.2.5-bbe2bd",
  "org.scalablytyped" %%% "tensorflow__tfjs-converter" % "1.2.5-044a74",
  "org.scalablytyped" %%% "tensorflow__tfjs-core" % "1.2.5-b98c83",
  "org.scalablytyped" %%% "tensorflow__tfjs-data" % "1.2.5-366990",
  "org.scalablytyped" %%% "tensorflow__tfjs-layers" % "1.2.5-8268ca",
  "org.scalablytyped" %%% "webgl2" % "0.0-unknown-dt-20190711Z-f7fa72")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        