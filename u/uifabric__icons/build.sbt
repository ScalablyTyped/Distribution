organization := "org.scalablytyped"
name := "uifabric__icons"
version := "6.4.0-c07a54"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.6.3-9f8404",
  "org.scalablytyped" %%% "microsoft__load-themed-styles" % "1.8.65-645f8b",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190311Z-8b4969",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-f878d0",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190306Z-24375e",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190213Z-020bc5",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "tslib" % "1.9.3-28a6ab",
  "org.scalablytyped" %%% "uifabric__merge-styles" % "6.16.1-69da69",
  "org.scalablytyped" %%% "uifabric__set-version" % "1.1.3-e585b3",
  "org.scalablytyped" %%% "uifabric__styling" % "6.44.1-9a45f7",
  "org.scalablytyped" %%% "uifabric__utilities" % "6.34.0-825d98")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        