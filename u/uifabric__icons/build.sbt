organization := "org.scalablytyped"
name := "uifabric__icons"
version := "7.9.5-0c103b"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-4db30e",
  "org.scalablytyped" %%% "enzyme" % "3.10-dt-20220818Z-5a8cad",
  "org.scalablytyped" %%% "fluentui__dom-utilities" % "2.2.2-1c7dc5",
  "org.scalablytyped" %%% "fluentui__merge-styles" % "8.5.3-1bae50",
  "org.scalablytyped" %%% "fluentui__theme" % "2.6.17-acd6b5",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-8a1cd9",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221104Z-cf549b",
  "org.scalablytyped" %%% "react-test-renderer" % "18.0-dt-20220805Z-9a7cb3",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-6206c7",
  "org.scalablytyped" %%% "sinon" % "10.0-dt-20220720Z-e69298",
  "org.scalablytyped" %%% "sinonjs__fake-timers" % "8.1-dt-20220323Z-ad21fc",
  "org.scalablytyped" %%% "std" % "4.9-5f989f",
  "org.scalablytyped" %%% "uifabric__merge-styles" % "7.20.2-4cd325",
  "org.scalablytyped" %%% "uifabric__styling" % "7.25.1-e5bee3",
  "org.scalablytyped" %%% "uifabric__utilities" % "7.38.2-35f6cc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
