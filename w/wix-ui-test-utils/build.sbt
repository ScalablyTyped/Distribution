organization := "org.scalablytyped"
name := "wix-ui-test-utils"
version := "1.0.191-ac7ecd"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "blocking-proxy" % "1.0.1-0ff1b6",
  "org.scalablytyped" %%% "csstype" % "3.1.1-9b270c",
  "org.scalablytyped" %%% "enzyme" % "3.10-dt-20220818Z-ef418c",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-874609",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-9c1d48",
  "org.scalablytyped" %%% "protractor" % "7.0.0-60ede5",
  "org.scalablytyped" %%% "q" % "1.5-dt-20220819Z-5fc856",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221104Z-c1aa2f",
  "org.scalablytyped" %%% "react-dom" % "18.0-dt-20221114Z-dfc723",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-fd69ea",
  "org.scalablytyped" %%% "selenium-webdriver" % "4.1-dt-20221108Z-123b63",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb",
  "org.scalablytyped" %%% "unidriver__core" % "1.3.0-4a4a0d",
  "org.scalablytyped" %%% "unidriver__jsdom-react" % "1.7.0-501606",
  "org.scalablytyped" %%% "webdriver-js-extender" % "2.2.0-82482a",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20220624Z-507aa7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
