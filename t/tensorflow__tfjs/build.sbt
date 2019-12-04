organization := "org.scalablytyped"
name := "tensorflow__tfjs"
version := "1.3.2-81e445"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "std" % "3.7-1d724d",
  "org.scalablytyped" %%% "tensorflow__tfjs-converter" % "1.3.2-ad3cc8",
  "org.scalablytyped" %%% "tensorflow__tfjs-core" % "1.3.2-7b28df",
  "org.scalablytyped" %%% "tensorflow__tfjs-data" % "1.3.2-8ab566",
  "org.scalablytyped" %%% "tensorflow__tfjs-layers" % "1.3.2-47e2cf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        