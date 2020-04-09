organization := "org.scalablytyped"
name := "tensorflow__tfjs-node"
version := "1.7.2-44d246"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "13.11-dt-20200402Z-9a87f0",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "tensorflow__tfjs" % "1.7.2-94e8a9",
  "org.scalablytyped" %%% "tensorflow__tfjs-converter" % "1.7.2-0a6cec",
  "org.scalablytyped" %%% "tensorflow__tfjs-core" % "1.7.2-39cca4",
  "org.scalablytyped" %%% "tensorflow__tfjs-data" % "1.7.2-3b74e9",
  "org.scalablytyped" %%% "tensorflow__tfjs-layers" % "1.7.2-dc9924")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
