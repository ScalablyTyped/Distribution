organization := "org.scalablytyped"
name := "tensorflow__tfjs"
version := "1.2.10-be0520"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "std" % "3.6-abb6d3",
  "org.scalablytyped" %%% "tensorflow__tfjs-converter" % "1.2.10-cd65c5",
  "org.scalablytyped" %%% "tensorflow__tfjs-core" % "1.2.10-9a6874",
  "org.scalablytyped" %%% "tensorflow__tfjs-data" % "1.2.10-87e18e",
  "org.scalablytyped" %%% "tensorflow__tfjs-layers" % "1.2.10-1316cc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        