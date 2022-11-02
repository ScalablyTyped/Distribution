organization := "org.scalablytyped"
name := "webdriverio"
version := "7.25.4-2cfc68"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20211202Z-6dfedf",
  "org.scalablytyped" %%% "devtools" % "7.25.4-b5a13f",
  "org.scalablytyped" %%% "devtools-protocol" % "0.0.1064701-d7bce2",
  "org.scalablytyped" %%% "loglevel" % "1.8.0-8a2d46",
  "org.scalablytyped" %%% "ms" % "v0.7.1-dt-20220818Z-bb1d3f",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-d0f137",
  "org.scalablytyped" %%% "puppeteer-core" % "19.2.0-b3f377",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "typescript" % "4.8.4-60b1be",
  "org.scalablytyped" %%% "wdio__logger" % "7.19.0-f888c4",
  "org.scalablytyped" %%% "wdio__protocols" % "7.22.0-1a1436",
  "org.scalablytyped" %%% "wdio__types" % "7.25.4-67b0b7",
  "org.scalablytyped" %%% "webdriver" % "7.25.4-de8005",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20220624Z-370f29")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
