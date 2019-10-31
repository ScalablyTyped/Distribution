organization := "org.scalablytyped"
name := "tensorflow__tfjs-node"
version := "1.3.1-5878db"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a",
  "org.scalablytyped" %%% "tensorflow__tfjs" % "1.3.1-47d68b",
  "org.scalablytyped" %%% "tensorflow__tfjs-converter" % "1.3.1-7bfe55",
  "org.scalablytyped" %%% "tensorflow__tfjs-core" % "1.3.1-cc305d",
  "org.scalablytyped" %%% "tensorflow__tfjs-data" % "1.3.1-d37312",
  "org.scalablytyped" %%% "tensorflow__tfjs-layers" % "1.3.1-4ca31e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        