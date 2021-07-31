organization := "org.scalablytyped"
name := "wix-ui-test-utils"
version := "1.0.177-1e60f3"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "blocking-proxy" % "1.0.1-ef2bc8",
  "org.scalablytyped" %%% "cheerio" % "v0.22.0-dt-20201002Z-2e8b87",
  "org.scalablytyped" %%% "csstype" % "2.6.14-b8d190",
  "org.scalablytyped" %%% "enzyme" % "3.10-dt-20201028Z-534c7d",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-814aa8",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-a12f9a",
  "org.scalablytyped" %%% "protractor" % "7.0.0-ebfdda",
  "org.scalablytyped" %%% "puppeteer" % "5.4-dt-20201103Z-f1a3ba",
  "org.scalablytyped" %%% "q" % "1.5-dt-20201002Z-f54a76",
  "org.scalablytyped" %%% "react" % "17.0-dt-20201121Z-c80121",
  "org.scalablytyped" %%% "react-dom" % "17.0-dt-20201120Z-95d384",
  "org.scalablytyped" %%% "selenium-webdriver" % "4.0-dt-20201028Z-25e67c",
  "org.scalablytyped" %%% "std" % "4.1-044efb",
  "org.scalablytyped" %%% "unidriver__core" % "1.2.1-61d2f7",
  "org.scalablytyped" %%% "unidriver__jsdom-react" % "1.6.1-ee6535",
  "org.scalablytyped" %%% "webdriver-js-extender" % "2.1.0-9a4217")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
