organization := "org.scalablytyped"
name := "tensorflow__tfjs-node"
version := "1.5.1-ec8951"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "13.1-dt-20191226Z-155d58",
  "org.scalablytyped" %%% "std" % "3.7-953338",
  "org.scalablytyped" %%% "tensorflow__tfjs" % "1.5.1-e56c37",
  "org.scalablytyped" %%% "tensorflow__tfjs-converter" % "1.5.1-332c37",
  "org.scalablytyped" %%% "tensorflow__tfjs-core" % "1.5.1-37c365",
  "org.scalablytyped" %%% "tensorflow__tfjs-data" % "1.5.1-78f3dc",
  "org.scalablytyped" %%% "tensorflow__tfjs-layers" % "1.5.1-46fad5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        