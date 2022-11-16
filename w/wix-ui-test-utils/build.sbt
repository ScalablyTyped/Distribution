organization := "org.scalablytyped"
name := "wix-ui-test-utils"
version := "1.0.191-2070bc"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "blocking-proxy" % "1.0.1-29492f",
  "org.scalablytyped" %%% "csstype" % "3.1.1-ab3df7",
  "org.scalablytyped" %%% "enzyme" % "3.10-dt-20220818Z-9dd215",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-4346d8",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-53873f",
  "org.scalablytyped" %%% "protractor" % "7.0.0-78d5d0",
  "org.scalablytyped" %%% "q" % "1.5-dt-20220819Z-ed8b8d",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221104Z-9ff1b2",
  "org.scalablytyped" %%% "react-dom" % "18.0-dt-20221114Z-6bbe70",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-ea4558",
  "org.scalablytyped" %%% "selenium-webdriver" % "4.1-dt-20221108Z-9f473f",
  "org.scalablytyped" %%% "std" % "4.9-c133ce",
  "org.scalablytyped" %%% "unidriver__core" % "1.3.0-665f7f",
  "org.scalablytyped" %%% "unidriver__jsdom-react" % "1.7.0-aa33cf",
  "org.scalablytyped" %%% "webdriver-js-extender" % "2.2.0-e11f82",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20220624Z-0611bd")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
