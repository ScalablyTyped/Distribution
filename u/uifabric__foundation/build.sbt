organization := "org.scalablytyped"
name := "uifabric__foundation"
version := "7.10.16-065877"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-f779a1",
  "org.scalablytyped" %%% "enzyme" % "3.10-dt-20220818Z-f01dc1",
  "org.scalablytyped" %%% "fluentui__dom-utilities" % "2.2.2-d40a2d",
  "org.scalablytyped" %%% "fluentui__merge-styles" % "8.5.3-73eb96",
  "org.scalablytyped" %%% "fluentui__theme" % "2.6.17-c29777",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-fada11",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221104Z-fab591",
  "org.scalablytyped" %%% "react-test-renderer" % "18.0-dt-20220805Z-6d095b",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-08aa87",
  "org.scalablytyped" %%% "sinon" % "10.0-dt-20220720Z-663467",
  "org.scalablytyped" %%% "sinonjs__fake-timers" % "8.1-dt-20220323Z-553558",
  "org.scalablytyped" %%% "std" % "4.8-686d1d",
  "org.scalablytyped" %%% "uifabric__merge-styles" % "7.20.2-3f17c4",
  "org.scalablytyped" %%% "uifabric__utilities" % "7.38.2-f664a3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
