organization := "org.scalablytyped"
name := "webdriverio"
version := "7.25.4-00d627"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20211202Z-03d2f5",
  "org.scalablytyped" %%% "devtools" % "7.25.4-bf1f9d",
  "org.scalablytyped" %%% "devtools-protocol" % "0.0.1066334-e8c43d",
  "org.scalablytyped" %%% "loglevel" % "1.8.1-34f6e8",
  "org.scalablytyped" %%% "ms" % "v0.7.1-dt-20220818Z-bb1d3f",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-86f548",
  "org.scalablytyped" %%% "puppeteer-core" % "19.2.2-e9660b",
  "org.scalablytyped" %%% "std" % "4.8-686d1d",
  "org.scalablytyped" %%% "typescript" % "4.8.4-227bad",
  "org.scalablytyped" %%% "wdio__logger" % "7.19.0-c8c1a9",
  "org.scalablytyped" %%% "wdio__protocols" % "7.22.0-1b1f0e",
  "org.scalablytyped" %%% "wdio__types" % "7.25.4-93368f",
  "org.scalablytyped" %%% "webdriver" % "7.25.4-494496",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20220624Z-38b082")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
