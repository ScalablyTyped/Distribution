organization := "org.scalablytyped"
name := "uifabric__icons"
version := "6.3.0-30716c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.5.8-36deb1",
  "org.scalablytyped" %%% "microsoft__load-themed-styles" % "1.8.54-cb3943",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-7438ae",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-e51e1e",
  "org.scalablytyped" %%% "react" % "16.7-dt-20190116Z-73addc",
  "org.scalablytyped" %%% "react-dom" % "16.0-dt-20181127Z-99d6f9",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1",
  "org.scalablytyped" %%% "tslib" % "1.9.3-688770",
  "org.scalablytyped" %%% "uifabric__merge-styles" % "6.15.0-7b0200",
  "org.scalablytyped" %%% "uifabric__set-version" % "1.1.3-51e630",
  "org.scalablytyped" %%% "uifabric__styling" % "6.41.0-ddd624",
  "org.scalablytyped" %%% "uifabric__utilities" % "6.28.0-393d55")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        