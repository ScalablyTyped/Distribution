organization := "org.scalablytyped"
name := "wix-ui-core"
version := "3.0.153-5a4a63"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "blocking-proxy" % "1.0.1-ef2bc8",
  "org.scalablytyped" %%% "cheerio" % "v0.22.0-dt-20201002Z-2e8b87",
  "org.scalablytyped" %%% "csstype" % "2.6.14-b8d190",
  "org.scalablytyped" %%% "emotion__core" % "10.1.1-9ae3af",
  "org.scalablytyped" %%% "emotion__serialize" % "0.11.16-1f167e",
  "org.scalablytyped" %%% "emotion__utils" % "0.11.3-d9c993",
  "org.scalablytyped" %%% "enzyme" % "3.10-dt-20201028Z-534c7d",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-814aa8",
  "org.scalablytyped" %%% "popper_dot_js" % "1.16.1-47a880",
  "org.scalablytyped" %%% "popperjs__core" % "2.5.4-e7f79e",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-a12f9a",
  "org.scalablytyped" %%% "protractor" % "7.0.0-ebfdda",
  "org.scalablytyped" %%% "puppeteer" % "5.4-dt-20201103Z-f1a3ba",
  "org.scalablytyped" %%% "q" % "1.5-dt-20201002Z-f54a76",
  "org.scalablytyped" %%% "react" % "17.0-dt-20201121Z-c80121",
  "org.scalablytyped" %%% "react-dom" % "17.0-dt-20201120Z-95d384",
  "org.scalablytyped" %%% "react-popper" % "2.2.4-cd8a79",
  "org.scalablytyped" %%% "selenium-webdriver" % "4.0-dt-20201028Z-25e67c",
  "org.scalablytyped" %%% "std" % "4.1-044efb",
  "org.scalablytyped" %%% "stylable__runtime" % "3.11.7-90c4a5",
  "org.scalablytyped" %%% "type-zoo" % "3.1.1-f987aa",
  "org.scalablytyped" %%% "unidriver__core" % "1.2.1-61d2f7",
  "org.scalablytyped" %%% "unidriver__jsdom-react" % "1.6.1-ee6535",
  "org.scalablytyped" %%% "webdriver-js-extender" % "2.1.0-9a4217",
  "org.scalablytyped" %%% "wix-ui-test-utils" % "1.0.177-1e60f3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
