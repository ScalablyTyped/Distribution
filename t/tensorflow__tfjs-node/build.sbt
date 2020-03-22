organization := "org.scalablytyped"
name := "tensorflow__tfjs-node"
version := "1.5.2-a92c71"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "13.7-dt-20200211Z-b30bde",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "tensorflow__tfjs" % "1.5.2-2286cc",
  "org.scalablytyped" %%% "tensorflow__tfjs-converter" % "1.5.2-483c01",
  "org.scalablytyped" %%% "tensorflow__tfjs-core" % "1.5.2-e8207a",
  "org.scalablytyped" %%% "tensorflow__tfjs-data" % "1.5.2-89568e",
  "org.scalablytyped" %%% "tensorflow__tfjs-layers" % "1.5.2-8ef695")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
