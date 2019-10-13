organization := "org.scalablytyped"
name := "tensorflow__tfjs"
version := "1.2.11-71fe0a"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a",
  "org.scalablytyped" %%% "tensorflow__tfjs-converter" % "1.2.11-9f6813",
  "org.scalablytyped" %%% "tensorflow__tfjs-core" % "1.2.11-e484f8",
  "org.scalablytyped" %%% "tensorflow__tfjs-data" % "1.2.11-8f414f",
  "org.scalablytyped" %%% "tensorflow__tfjs-layers" % "1.2.11-f220bc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        