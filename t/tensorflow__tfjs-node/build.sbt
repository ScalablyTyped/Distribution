organization := "org.scalablytyped"
name := "tensorflow__tfjs-node"
version := "1.3.1-5e8c71"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf",
  "org.scalablytyped" %%% "tensorflow__tfjs" % "1.3.2-cd8253",
  "org.scalablytyped" %%% "tensorflow__tfjs-converter" % "1.3.2-caf130",
  "org.scalablytyped" %%% "tensorflow__tfjs-core" % "1.3.2-4f2cb7",
  "org.scalablytyped" %%% "tensorflow__tfjs-data" % "1.3.2-8607c8",
  "org.scalablytyped" %%% "tensorflow__tfjs-layers" % "1.3.2-c1b2e3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        