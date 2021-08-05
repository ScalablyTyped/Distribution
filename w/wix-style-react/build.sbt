organization := "org.scalablytyped"
name := "wix-style-react"
version := "9.42.0-75d18b"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "blocking-proxy" % "1.0.1-0004db",
  "org.scalablytyped" %%% "cheerio" % "v0.22.0-dt-20201002Z-ea69bf",
  "org.scalablytyped" %%% "color" % "3.0-dt-20200923Z-6d0bf0",
  "org.scalablytyped" %%% "color-convert" % "1.9-dt-20200515Z-eead50",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20200515Z-123ec4",
  "org.scalablytyped" %%% "csstype" % "2.6.14-344a29",
  "org.scalablytyped" %%% "emotion__core" % "10.1.1-c9baa4",
  "org.scalablytyped" %%% "emotion__serialize" % "0.11.16-930fda",
  "org.scalablytyped" %%% "emotion__utils" % "0.11.3-2a6db3",
  "org.scalablytyped" %%% "enzyme" % "3.10-dt-20201028Z-118334",
  "org.scalablytyped" %%% "moment" % "2.29.1-f52f14",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-e00132",
  "org.scalablytyped" %%% "popper_dot_js" % "1.16.1-d7f5b4",
  "org.scalablytyped" %%% "popperjs__core" % "2.5.4-aeacae",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-49dd4c",
  "org.scalablytyped" %%% "protractor" % "7.0.0-4a4b6f",
  "org.scalablytyped" %%% "puppeteer" % "5.4-dt-20201103Z-bb0bb6",
  "org.scalablytyped" %%% "q" % "1.5-dt-20201002Z-335752",
  "org.scalablytyped" %%% "react" % "17.0-dt-20201121Z-76d083",
  "org.scalablytyped" %%% "react-dom" % "17.0-dt-20201120Z-add176",
  "org.scalablytyped" %%% "react-popper" % "2.2.4-0c75b3",
  "org.scalablytyped" %%% "selenium-webdriver" % "4.0-dt-20201028Z-295067",
  "org.scalablytyped" %%% "std" % "4.1-2f6855",
  "org.scalablytyped" %%% "stylable__runtime" % "3.11.7-da590d",
  "org.scalablytyped" %%% "type-zoo" % "3.1.1-7fa7e9",
  "org.scalablytyped" %%% "unidriver__core" % "1.2.1-aea57c",
  "org.scalablytyped" %%% "unidriver__jsdom-react" % "1.6.1-e061f5",
  "org.scalablytyped" %%% "webdriver-js-extender" % "2.1.0-5464b7",
  "org.scalablytyped" %%% "wix-ui-core" % "3.0.153-24e3a5",
  "org.scalablytyped" %%% "wix-ui-test-utils" % "1.0.177-3e870d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
