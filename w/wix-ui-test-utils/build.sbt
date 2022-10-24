organization := "org.scalablytyped"
name := "wix-ui-test-utils"
version := "1.0.191-fb4bff"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "blocking-proxy" % "1.0.1-951cad",
  "org.scalablytyped" %%% "csstype" % "3.1.1-9ea52b",
  "org.scalablytyped" %%% "enzyme" % "3.10-dt-20220818Z-1a0cc0",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221023Z-05fcff",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-115604",
  "org.scalablytyped" %%% "protractor" % "7.0.0-19661e",
  "org.scalablytyped" %%% "q" % "1.5-dt-20220819Z-96a756",
  "org.scalablytyped" %%% "react" % "18.0-dt-20220922Z-16e74e",
  "org.scalablytyped" %%% "react-dom" % "18.0-dt-20220819Z-477d81",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-21791a",
  "org.scalablytyped" %%% "selenium-webdriver" % "4.1-dt-20221018Z-603715",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "unidriver__core" % "1.3.0-540a8e",
  "org.scalablytyped" %%% "unidriver__jsdom-react" % "1.7.0-226add",
  "org.scalablytyped" %%% "webdriver-js-extender" % "2.2.0-b203ef",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20220624Z-20cc7d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
