organization := "org.scalablytyped"
name := "tensorflow__tfjs-node"
version := "1.2.10-acff3f"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "std" % "3.6-c16502",
  "org.scalablytyped" %%% "tensorflow__tfjs" % "1.2.10-e358e7",
  "org.scalablytyped" %%% "tensorflow__tfjs-converter" % "1.2.10-c36754",
  "org.scalablytyped" %%% "tensorflow__tfjs-core" % "1.2.10-2e6f5e",
  "org.scalablytyped" %%% "tensorflow__tfjs-data" % "1.2.10-d42063",
  "org.scalablytyped" %%% "tensorflow__tfjs-layers" % "1.2.10-4f9d57")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        