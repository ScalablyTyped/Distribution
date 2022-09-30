organization := "org.scalablytyped"
name := "webdriverio"
version := "7.25.0-884a64"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20211202Z-96a1cd",
  "org.scalablytyped" %%% "devtools" % "7.25.0-e7fa7e",
  "org.scalablytyped" %%% "devtools-protocol" % "0.0.1051614-474004",
  "org.scalablytyped" %%% "loglevel" % "1.8.0-cbcc55",
  "org.scalablytyped" %%% "ms" % "v0.7.1-dt-20220818Z-0be45f",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220926Z-d201ab",
  "org.scalablytyped" %%% "puppeteer-core" % "18.0.5-66a42c",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb",
  "org.scalablytyped" %%% "typescript" % "4.8.4-6579b4",
  "org.scalablytyped" %%% "wdio__logger" % "7.19.0-2248ac",
  "org.scalablytyped" %%% "wdio__protocols" % "7.22.0-e80fb9",
  "org.scalablytyped" %%% "wdio__types" % "7.25.0-f94042",
  "org.scalablytyped" %%% "webdriver" % "7.25.0-cd94b2",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20220624Z-142b86")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
