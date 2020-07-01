organization := "org.scalablytyped"
name := "tensorflow__tfjs-node"
version := "1.7.4-823870"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200624Z-2fcd45",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8",
  "org.scalablytyped" %%% "tensorflow__tfjs" % "1.7.4-326c59",
  "org.scalablytyped" %%% "tensorflow__tfjs-converter" % "1.7.4-ffe96a",
  "org.scalablytyped" %%% "tensorflow__tfjs-core" % "1.7.4-32a263",
  "org.scalablytyped" %%% "tensorflow__tfjs-data" % "1.7.4-e9d236",
  "org.scalablytyped" %%% "tensorflow__tfjs-layers" % "1.7.4-2dd34d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
