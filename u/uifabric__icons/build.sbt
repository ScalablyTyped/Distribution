organization := "org.scalablytyped"
name := "uifabric__icons"
version := "6.5.0-87e617"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.6.3-29f798",
  "org.scalablytyped" %%% "microsoft__load-themed-styles" % "1.8.72-645f8b",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190319Z-4635bc",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-f878d0",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190314Z-6f0f1a",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190320Z-188abf",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "tslib" % "1.9.3-28a6ab",
  "org.scalablytyped" %%% "uifabric__merge-styles" % "6.16.1-69da69",
  "org.scalablytyped" %%% "uifabric__set-version" % "1.1.3-e585b3",
  "org.scalablytyped" %%% "uifabric__styling" % "6.45.0-3977d8",
  "org.scalablytyped" %%% "uifabric__utilities" % "6.35.1-4c021c")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        