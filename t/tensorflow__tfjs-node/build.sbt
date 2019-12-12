organization := "org.scalablytyped"
name := "tensorflow__tfjs-node"
version := "1.3.2-9337ac"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191126Z-959704",
  "org.scalablytyped" %%% "std" % "3.7-1d724d",
  "org.scalablytyped" %%% "tensorflow__tfjs" % "1.3.2-e0492f",
  "org.scalablytyped" %%% "tensorflow__tfjs-converter" % "1.3.2-f204bd",
  "org.scalablytyped" %%% "tensorflow__tfjs-core" % "1.3.2-31c4bf",
  "org.scalablytyped" %%% "tensorflow__tfjs-data" % "1.3.2-907469",
  "org.scalablytyped" %%% "tensorflow__tfjs-layers" % "1.3.2-d94590")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        