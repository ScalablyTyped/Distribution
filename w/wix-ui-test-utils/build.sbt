organization := "org.scalablytyped"
name := "wix-ui-test-utils"
version := "1.0.191-c9e06c"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "blocking-proxy" % "1.0.1-2942c6",
  "org.scalablytyped" %%% "csstype" % "3.1.1-0912f8",
  "org.scalablytyped" %%% "enzyme" % "3.10-dt-20220818Z-6d7c61",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220926Z-d201ab",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-975e63",
  "org.scalablytyped" %%% "protractor" % "7.0.0-cb0639",
  "org.scalablytyped" %%% "q" % "1.5-dt-20220819Z-1ac3b1",
  "org.scalablytyped" %%% "react" % "18.0-dt-20220922Z-fc8273",
  "org.scalablytyped" %%% "react-dom" % "18.0-dt-20220819Z-09251e",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-3fbb8c",
  "org.scalablytyped" %%% "selenium-webdriver" % "4.1-dt-20220909Z-afa19c",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb",
  "org.scalablytyped" %%% "unidriver__core" % "1.3.0-e497ae",
  "org.scalablytyped" %%% "unidriver__jsdom-react" % "1.7.0-3dab23",
  "org.scalablytyped" %%% "webdriver-js-extender" % "2.2.0-28cac5",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20220624Z-142b86")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
