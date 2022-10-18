organization := "org.scalablytyped"
name := "uifabric__styling"
version := "7.25.0-c12e7f"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-775404",
  "org.scalablytyped" %%% "enzyme" % "3.10-dt-20220818Z-24097b",
  "org.scalablytyped" %%% "fluentui__dom-utilities" % "2.2.2-d82555",
  "org.scalablytyped" %%% "fluentui__merge-styles" % "8.5.3-0f28f1",
  "org.scalablytyped" %%% "fluentui__theme" % "2.6.16-fb8bd5",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-4c7983",
  "org.scalablytyped" %%% "react" % "18.0-dt-20220922Z-bacd1f",
  "org.scalablytyped" %%% "react-test-renderer" % "18.0-dt-20220805Z-dc4815",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-400bee",
  "org.scalablytyped" %%% "sinon" % "10.0-dt-20220720Z-86edef",
  "org.scalablytyped" %%% "sinonjs__fake-timers" % "8.1-dt-20220323Z-e3da4a",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "uifabric__merge-styles" % "7.20.1-3e326a",
  "org.scalablytyped" %%% "uifabric__utilities" % "7.38.1-2dc496")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
