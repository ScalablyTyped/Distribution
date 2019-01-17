organization := "org.scalablytyped"
name := "uifabric__icons"
version := "6.3.0-2eb117"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.5.8-61e37d",
  "org.scalablytyped" %%% "microsoft__load-themed-styles" % "1.8.54-18f836",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2be335",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-692895",
  "org.scalablytyped" %%% "react" % "16.7-dt-20190116Z-334a51",
  "org.scalablytyped" %%% "react-dom" % "16.0-dt-20181127Z-557855",
  "org.scalablytyped" %%% "std" % "3.2.2-2926f1",
  "org.scalablytyped" %%% "tslib" % "1.9.3-cc9481",
  "org.scalablytyped" %%% "uifabric__merge-styles" % "6.15.0-b7a19c",
  "org.scalablytyped" %%% "uifabric__set-version" % "1.1.3-8359fa",
  "org.scalablytyped" %%% "uifabric__styling" % "6.41.0-b11c95",
  "org.scalablytyped" %%% "uifabric__utilities" % "6.28.0-121354")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        