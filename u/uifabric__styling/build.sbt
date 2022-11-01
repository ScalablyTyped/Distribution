organization := "org.scalablytyped"
name := "uifabric__styling"
version := "7.25.1-1de6ec"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-9ea52b",
  "org.scalablytyped" %%% "enzyme" % "3.10-dt-20220818Z-a99f73",
  "org.scalablytyped" %%% "fluentui__dom-utilities" % "2.2.2-5950e4",
  "org.scalablytyped" %%% "fluentui__merge-styles" % "8.5.3-17abf1",
  "org.scalablytyped" %%% "fluentui__theme" % "2.6.17-5389d9",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-115604",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221027Z-1a0a13",
  "org.scalablytyped" %%% "react-test-renderer" % "18.0-dt-20220805Z-4acc51",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-21791a",
  "org.scalablytyped" %%% "sinon" % "10.0-dt-20220720Z-556da5",
  "org.scalablytyped" %%% "sinonjs__fake-timers" % "8.1-dt-20220323Z-7adbb2",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "uifabric__merge-styles" % "7.20.2-c76f2f",
  "org.scalablytyped" %%% "uifabric__utilities" % "7.38.2-8e62ed")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
