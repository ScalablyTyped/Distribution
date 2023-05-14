organization := "org.scalablytyped"
name := "wix-ui-test-utils"
version := "1.0.191-9596da"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "blocking-proxy" % "1.0.1-b2d166",
  "org.scalablytyped" %%% "csstype" % "3.1.2-5927f3",
  "org.scalablytyped" %%% "enzyme" % "3.10-dt-20230415Z-747887",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230513Z-b25634",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-4446ee",
  "org.scalablytyped" %%% "protractor" % "7.0.0-90b451",
  "org.scalablytyped" %%% "q" % "1.5-dt-20221230Z-f67b26",
  "org.scalablytyped" %%% "react" % "18.2-dt-20230506Z-14ab9d",
  "org.scalablytyped" %%% "react-dom" % "18.2-dt-20230505Z-9874d1",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20230322Z-da1b40",
  "org.scalablytyped" %%% "selenium-webdriver" % "4.1-dt-20230429Z-65c886",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "unidriver__core" % "1.3.0-9e32be",
  "org.scalablytyped" %%% "unidriver__jsdom-react" % "1.7.0-cf3409",
  "org.scalablytyped" %%% "webdriver-js-extender" % "2.2.0-983287",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20221230Z-6a0345")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
