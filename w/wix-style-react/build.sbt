organization := "org.scalablytyped"
name := "wix-style-react"
version := "9.42.0-724f27"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "blocking-proxy" % "1.0.1-d04ec0",
  "org.scalablytyped" %%% "cheerio" % "v0.22.0-dt-20201002Z-4ba907",
  "org.scalablytyped" %%% "color" % "3.0-dt-20200923Z-981a4e",
  "org.scalablytyped" %%% "color-convert" % "1.9-dt-20200515Z-eead50",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20200515Z-123ec4",
  "org.scalablytyped" %%% "csstype" % "2.6.14-dc2f99",
  "org.scalablytyped" %%% "emotion__core" % "10.1.1-65bf16",
  "org.scalablytyped" %%% "emotion__serialize" % "0.11.16-b57f85",
  "org.scalablytyped" %%% "emotion__utils" % "0.11.3-2561dd",
  "org.scalablytyped" %%% "enzyme" % "3.10-dt-20201028Z-bcb701",
  "org.scalablytyped" %%% "moment" % "2.29.1-4a676b",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-11c649",
  "org.scalablytyped" %%% "popper_dot_js" % "1.16.1-67b618",
  "org.scalablytyped" %%% "popperjs__core" % "2.5.4-314868",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-3fbed9",
  "org.scalablytyped" %%% "protractor" % "7.0.0-d6a9bd",
  "org.scalablytyped" %%% "puppeteer" % "5.4-dt-20201103Z-2c374e",
  "org.scalablytyped" %%% "q" % "1.5-dt-20201002Z-a93b2a",
  "org.scalablytyped" %%% "react" % "17.0-dt-20201121Z-4ff700",
  "org.scalablytyped" %%% "react-dom" % "17.0-dt-20201120Z-f7391b",
  "org.scalablytyped" %%% "react-popper" % "2.2.4-f870bf",
  "org.scalablytyped" %%% "selenium-webdriver" % "4.0-dt-20201028Z-4ada20",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab",
  "org.scalablytyped" %%% "stylable__runtime" % "3.11.7-e110aa",
  "org.scalablytyped" %%% "type-zoo" % "3.1.1-aa43a0",
  "org.scalablytyped" %%% "unidriver__core" % "1.2.1-249204",
  "org.scalablytyped" %%% "unidriver__jsdom-react" % "1.6.1-32dd79",
  "org.scalablytyped" %%% "webdriver-js-extender" % "2.1.0-1cbdbb",
  "org.scalablytyped" %%% "wix-ui-core" % "3.0.153-b285ab",
  "org.scalablytyped" %%% "wix-ui-test-utils" % "1.0.177-dfb6e2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
