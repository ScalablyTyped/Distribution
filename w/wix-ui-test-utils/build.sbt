organization := "org.scalablytyped"
name := "wix-ui-test-utils"
version := "1.0.191-e0c4e5"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "blocking-proxy" % "1.0.1-5bc5fc",
  "org.scalablytyped" %%% "csstype" % "3.1.1-775404",
  "org.scalablytyped" %%% "enzyme" % "3.10-dt-20220818Z-24097b",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221015Z-0a42ca",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-4c7983",
  "org.scalablytyped" %%% "protractor" % "7.0.0-e4c788",
  "org.scalablytyped" %%% "q" % "1.5-dt-20220819Z-1566b2",
  "org.scalablytyped" %%% "react" % "18.0-dt-20220922Z-bacd1f",
  "org.scalablytyped" %%% "react-dom" % "18.0-dt-20220819Z-73fb03",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-400bee",
  "org.scalablytyped" %%% "selenium-webdriver" % "4.1-dt-20220909Z-a87c96",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "unidriver__core" % "1.3.0-e29d24",
  "org.scalablytyped" %%% "unidriver__jsdom-react" % "1.7.0-309f84",
  "org.scalablytyped" %%% "webdriver-js-extender" % "2.2.0-45b692",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20220624Z-54fbe6")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
