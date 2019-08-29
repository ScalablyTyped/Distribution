organization := "org.scalablytyped"
name := "tensorflow__tfjs"
version := "1.2.8-0144f8"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "std" % "3.6-c16502",
  "org.scalablytyped" %%% "tensorflow__tfjs-converter" % "1.2.8-6dae50",
  "org.scalablytyped" %%% "tensorflow__tfjs-core" % "1.2.8-8aa3c5",
  "org.scalablytyped" %%% "tensorflow__tfjs-data" % "1.2.8-37825e",
  "org.scalablytyped" %%% "tensorflow__tfjs-layers" % "1.2.8-55439b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        