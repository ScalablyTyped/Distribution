organization := "org.scalablytyped"
name := "tensorflow__tfjs-node"
version := "1.5.1-a19953"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200115Z-14f523",
  "org.scalablytyped" %%% "std" % "3.7-b6d959",
  "org.scalablytyped" %%% "tensorflow__tfjs" % "1.5.1-17daff",
  "org.scalablytyped" %%% "tensorflow__tfjs-converter" % "1.5.1-5a3771",
  "org.scalablytyped" %%% "tensorflow__tfjs-core" % "1.5.1-1a4184",
  "org.scalablytyped" %%% "tensorflow__tfjs-data" % "1.5.1-489c83",
  "org.scalablytyped" %%% "tensorflow__tfjs-layers" % "1.5.1-1f82e6")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        