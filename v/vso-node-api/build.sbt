organization := "org.scalablytyped"
name := "vso-node-api"
version := "6.5.0-0d1344"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "nock" % "v9.3.3-dt-20190121Z-bf33f6",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-8da1df",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314",
  "org.scalablytyped" %%% "tunnel" % "0.0-dt-20180214Z-d8eba5",
  "org.scalablytyped" %%% "typed-rest-client" % "1.0.11-c962bf",
  "org.scalablytyped" %%% "underscore" % "1.8-dt-20180808Z-416cd2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        