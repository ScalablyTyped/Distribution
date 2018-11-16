organization := "com.scalablytyped"
name := "vso-node-api"
version := "6.5.0-7c60cd"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "nock" % "v9.3.3-dt-20181102Z-d56833",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181116Z-806eaf",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "com.scalablytyped" %%% "tunnel" % "0.0-dt-20181102Z-4fc3b2",
  "com.scalablytyped" %%% "typed-rest-client" % "1.0.11-72ba73",
  "com.scalablytyped" %%% "underscore" % "1.8-dt-20181102Z-35c601",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        