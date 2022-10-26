organization := "org.scalablytyped"
name := "wix-style-react"
version := "10.58.3-a52ce9"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "aria-query" % "5.0-dt-20211202Z-63a520",
  "org.scalablytyped" %%% "blocking-proxy" % "1.0.1-47cb45",
  "org.scalablytyped" %%% "color" % "3.0-dt-20220819Z-b8ff90",
  "org.scalablytyped" %%% "color-convert" % "2.0-dt-20211202Z-7c7c1a",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20211202Z-135be1",
  "org.scalablytyped" %%% "css-element-queries" % "1.2.3-73b9c9",
  "org.scalablytyped" %%% "csstype" % "3.1.1-9ea52b",
  "org.scalablytyped" %%% "date-fns" % "2.29.3-92a2d5",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20211202Z-6dfedf",
  "org.scalablytyped" %%% "devtools-protocol" % "0.0.1061995-6c2bf2",
  "org.scalablytyped" %%% "dnd-core" % "16.0.1-2a3c56",
  "org.scalablytyped" %%% "enzyme" % "3.10-dt-20220818Z-3c844b",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20220928Z-3598f3",
  "org.scalablytyped" %%% "ms" % "v0.7.1-dt-20220818Z-bb1d3f",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221024Z-2be228",
  "org.scalablytyped" %%% "popper_dot_js" % "1.16.1-833116",
  "org.scalablytyped" %%% "pretty-format" % "29.2.1-d73ee0",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-115604",
  "org.scalablytyped" %%% "protractor" % "7.0.0-583f2b",
  "org.scalablytyped" %%% "puppeteer" % "19.1.0-15be85",
  "org.scalablytyped" %%% "puppeteer-core" % "19.1.0-223d51",
  "org.scalablytyped" %%% "q" % "1.5-dt-20220819Z-96a756",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221025Z-ca420a",
  "org.scalablytyped" %%% "react-dom" % "18.0-dt-20221024Z-bf50fa",
  "org.scalablytyped" %%% "react-types__shared" % "3.15.0-e9dd27",
  "org.scalablytyped" %%% "redux" % "4.2.0-6b25b9",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-21791a",
  "org.scalablytyped" %%% "selenium-webdriver" % "4.1-dt-20221018Z-9b7283",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "testing-library__dom" % "8.19.0-7f2922",
  "org.scalablytyped" %%% "testing-library__react" % "13.4.0-16a381",
  "org.scalablytyped" %%% "unidriver__core" % "1.3.0-540a8e",
  "org.scalablytyped" %%% "unidriver__jsdom-react" % "1.7.0-226add",
  "org.scalablytyped" %%% "webdriver-js-extender" % "2.2.0-f05ddc",
  "org.scalablytyped" %%% "wix-design-systems-locale-utils" % "1.70.0-a5cec3",
  "org.scalablytyped" %%% "wix-design-systems-providers" % "1.14.2-065bcc",
  "org.scalablytyped" %%% "wix-ui-test-utils" % "1.0.191-b17f33",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20220624Z-3e4a2a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
