organization := "org.scalablytyped"
name := "vso-node-api"
version := "6.5.0-ccf5e2"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "nock" % "v9.3.3-dt-20180628Z-f3ae89",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-e45326",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73",
  "org.scalablytyped" %%% "tunnel" % "0.0-dt-20180214Z-473309",
  "org.scalablytyped" %%% "typed-rest-client" % "1.0.11-5ea2bc",
  "org.scalablytyped" %%% "underscore" % "1.8-dt-20180808Z-09fcd3")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        