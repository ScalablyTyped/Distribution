organization := "org.scalablytyped"
name := "wix-ui-test-utils"
version := "1.0.191-d381a0"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "blocking-proxy" % "1.0.1-36ab36",
  "org.scalablytyped" %%% "csstype" % "3.1.1-4db30e",
  "org.scalablytyped" %%% "enzyme" % "3.10-dt-20220818Z-5a8cad",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-def929",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-8a1cd9",
  "org.scalablytyped" %%% "protractor" % "7.0.0-8de092",
  "org.scalablytyped" %%% "q" % "1.5-dt-20220819Z-6140fe",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221104Z-cf549b",
  "org.scalablytyped" %%% "react-dom" % "18.0-dt-20221114Z-e55fa5",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-6206c7",
  "org.scalablytyped" %%% "selenium-webdriver" % "4.1-dt-20221108Z-e40b48",
  "org.scalablytyped" %%% "std" % "4.9-5f989f",
  "org.scalablytyped" %%% "unidriver__core" % "1.3.0-ac164f",
  "org.scalablytyped" %%% "unidriver__jsdom-react" % "1.7.0-03ab43",
  "org.scalablytyped" %%% "webdriver-js-extender" % "2.2.0-b6979a",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20220624Z-3574d0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
