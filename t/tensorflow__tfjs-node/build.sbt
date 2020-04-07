organization := "org.scalablytyped"
name := "tensorflow__tfjs-node"
version := "1.7.0-0a9d31"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "13.9-dt-20200318Z-96a265",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "tensorflow__tfjs" % "1.7.0-2ce2b6",
  "org.scalablytyped" %%% "tensorflow__tfjs-converter" % "1.7.0-86537a",
  "org.scalablytyped" %%% "tensorflow__tfjs-core" % "1.7.0-ce32f5",
  "org.scalablytyped" %%% "tensorflow__tfjs-data" % "1.7.0-7a4d5a",
  "org.scalablytyped" %%% "tensorflow__tfjs-layers" % "1.7.0-673531")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
