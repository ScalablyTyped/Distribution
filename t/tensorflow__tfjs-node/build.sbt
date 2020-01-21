organization := "org.scalablytyped"
name := "tensorflow__tfjs-node"
version := "1.5.1-bac087"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200117Z-4be21b",
  "org.scalablytyped" %%% "std" % "3.7-96076c",
  "org.scalablytyped" %%% "tensorflow__tfjs" % "1.5.1-cf1b2b",
  "org.scalablytyped" %%% "tensorflow__tfjs-converter" % "1.5.1-7425e3",
  "org.scalablytyped" %%% "tensorflow__tfjs-core" % "1.5.1-4d8ae4",
  "org.scalablytyped" %%% "tensorflow__tfjs-data" % "1.5.1-3070ab",
  "org.scalablytyped" %%% "tensorflow__tfjs-layers" % "1.5.1-38f617")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        