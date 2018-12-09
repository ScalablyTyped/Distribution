organization := "org.scalablytyped"
name := "vso-node-api"
version := "6.5.0-781b2b"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "nock" % "v9.3.3-dt-20180910Z-e1ee1e",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-df5d12",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79",
  "org.scalablytyped" %%% "tunnel" % "0.0-dt-20180910Z-a3cb57",
  "org.scalablytyped" %%% "typed-rest-client" % "1.0.11-2be265",
  "org.scalablytyped" %%% "underscore" % "1.8-dt-20180910Z-057dfb")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        