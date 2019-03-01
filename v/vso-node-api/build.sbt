organization := "org.scalablytyped"
name := "vso-node-api"
version := "6.5.0-86f3d2"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-99335f",
  "org.scalablytyped" %%% "std" % "3.3-6e4388",
  "org.scalablytyped" %%% "tunnel" % "0.0-dt-20180214Z-29c61d",
  "org.scalablytyped" %%% "typed-rest-client" % "1.1.2-f563d0",
  "org.scalablytyped" %%% "underscore" % "1.8-dt-20190228Z-af9105")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        