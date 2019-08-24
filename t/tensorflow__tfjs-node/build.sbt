organization := "org.scalablytyped"
name := "tensorflow__tfjs-node"
version := "1.2.8-eaf701"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "std" % "3.5-cd493c",
  "org.scalablytyped" %%% "tensorflow__tfjs" % "1.2.8-de426e",
  "org.scalablytyped" %%% "tensorflow__tfjs-converter" % "1.2.8-61252c",
  "org.scalablytyped" %%% "tensorflow__tfjs-core" % "1.2.8-1f176d",
  "org.scalablytyped" %%% "tensorflow__tfjs-data" % "1.2.8-c90811",
  "org.scalablytyped" %%% "tensorflow__tfjs-layers" % "1.2.8-9db913",
  "org.scalablytyped" %%% "webgl2" % "0.0-unknown-dt-20190711Z-54dc7a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        