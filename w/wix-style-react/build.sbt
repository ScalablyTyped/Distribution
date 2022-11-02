organization := "org.scalablytyped"
name := "wix-style-react"
version := "10.60.0-0cc548"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "aria-query" % "5.0-dt-20221027Z-378656",
  "org.scalablytyped" %%% "blocking-proxy" % "1.0.1-681d35",
  "org.scalablytyped" %%% "color" % "3.0-dt-20220819Z-b8ff90",
  "org.scalablytyped" %%% "color-convert" % "2.0-dt-20211202Z-7c7c1a",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20211202Z-135be1",
  "org.scalablytyped" %%% "css-element-queries" % "1.2.3-73b9c9",
  "org.scalablytyped" %%% "csstype" % "3.1.1-9ea52b",
  "org.scalablytyped" %%% "date-fns" % "2.29.3-92a2d5",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20211202Z-6dfedf",
  "org.scalablytyped" %%% "devtools-protocol" % "0.0.1064701-d7bce2",
  "org.scalablytyped" %%% "dnd-core" % "16.0.1-2a3c56",
  "org.scalablytyped" %%% "enzyme" % "3.10-dt-20220818Z-a99f73",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20221101Z-8725a4",
  "org.scalablytyped" %%% "ms" % "v0.7.1-dt-20220818Z-bb1d3f",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-d0f137",
  "org.scalablytyped" %%% "popper_dot_js" % "1.16.1-833116",
  "org.scalablytyped" %%% "pretty-format" % "29.2.1-d73ee0",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-115604",
  "org.scalablytyped" %%% "protractor" % "7.0.0-f97e00",
  "org.scalablytyped" %%% "puppeteer" % "19.2.0-0d8dda",
  "org.scalablytyped" %%% "puppeteer-core" % "19.2.0-b3f377",
  "org.scalablytyped" %%% "q" % "1.5-dt-20220819Z-96a756",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221027Z-1a0a13",
  "org.scalablytyped" %%% "react-dom" % "18.0-dt-20221027Z-34f203",
  "org.scalablytyped" %%% "react-types__shared" % "3.15.0-e6d7fc",
  "org.scalablytyped" %%% "redux" % "4.2.0-6b25b9",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-21791a",
  "org.scalablytyped" %%% "selenium-webdriver" % "4.1-dt-20221101Z-107dc9",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "testing-library__dom" % "8.19.0-72033b",
  "org.scalablytyped" %%% "testing-library__react" % "13.4.0-98cb5e",
  "org.scalablytyped" %%% "unidriver__core" % "1.3.0-540a8e",
  "org.scalablytyped" %%% "unidriver__jsdom-react" % "1.7.0-226add",
  "org.scalablytyped" %%% "webdriver-js-extender" % "2.2.0-52d2fd",
  "org.scalablytyped" %%% "wix-design-systems-locale-utils" % "1.71.0-79b4d6",
  "org.scalablytyped" %%% "wix-design-systems-providers" % "1.16.0-e56986",
  "org.scalablytyped" %%% "wix-ui-test-utils" % "1.0.191-77691a",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20220624Z-370f29")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
