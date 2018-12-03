organization := "com.scalablytyped"
name := "vso-node-api"
version := "6.5.0-994152"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "nock" % "v9.3.3-dt-20180910Z-5f40cb",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181203Z-7004b3",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "com.scalablytyped" %%% "tunnel" % "0.0-dt-20180910Z-4381e5",
  "com.scalablytyped" %%% "typed-rest-client" % "1.0.11-2a2fcc",
  "com.scalablytyped" %%% "underscore" % "1.8-dt-20180910Z-87c49b",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        