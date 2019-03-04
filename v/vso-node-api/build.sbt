organization := "org.scalablytyped"
name := "vso-node-api"
version := "6.5.0-1c93fe"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-fd0a52",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "tunnel" % "0.0-dt-20180214Z-2f6678",
  "org.scalablytyped" %%% "typed-rest-client" % "1.1.2-29b3f2",
  "org.scalablytyped" %%% "underscore" % "1.8-dt-20190301Z-ef66e9")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        