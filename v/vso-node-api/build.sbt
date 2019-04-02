organization := "org.scalablytyped"
name := "vso-node-api"
version := "6.5.0-5b6b95"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190330Z-7c1cfd",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "tunnel" % "0.0-dt-20180214Z-3e07c6",
  "org.scalablytyped" %%% "typed-rest-client" % "1.2.0-ec1d8a",
  "org.scalablytyped" %%% "underscore" % "1.8-dt-20190322Z-2c9e42")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        