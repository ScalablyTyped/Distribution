organization := "org.scalablytyped"
name := "wix-ui-test-utils"
version := "1.0.177-dfb6e2"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "blocking-proxy" % "1.0.1-d04ec0",
  "org.scalablytyped" %%% "cheerio" % "v0.22.0-dt-20201002Z-4ba907",
  "org.scalablytyped" %%% "csstype" % "2.6.14-dc2f99",
  "org.scalablytyped" %%% "enzyme" % "3.10-dt-20201028Z-bcb701",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-11c649",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-3fbed9",
  "org.scalablytyped" %%% "protractor" % "7.0.0-d6a9bd",
  "org.scalablytyped" %%% "puppeteer" % "5.4-dt-20201103Z-2c374e",
  "org.scalablytyped" %%% "q" % "1.5-dt-20201002Z-a93b2a",
  "org.scalablytyped" %%% "react" % "17.0-dt-20201121Z-4ff700",
  "org.scalablytyped" %%% "react-dom" % "17.0-dt-20201120Z-f7391b",
  "org.scalablytyped" %%% "selenium-webdriver" % "4.0-dt-20201028Z-4ada20",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab",
  "org.scalablytyped" %%% "unidriver__core" % "1.2.1-249204",
  "org.scalablytyped" %%% "unidriver__jsdom-react" % "1.6.1-32dd79",
  "org.scalablytyped" %%% "webdriver-js-extender" % "2.1.0-1cbdbb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
