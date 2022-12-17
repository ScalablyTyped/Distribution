organization := "org.scalablytyped"
name := "webdriverio"
version := "7.26.0-691668"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20211202Z-00fd1d",
  "org.scalablytyped" %%% "devtools" % "7.26.0-4569cd",
  "org.scalablytyped" %%% "devtools-protocol" % "0.0.1070637-6cacaf",
  "org.scalablytyped" %%% "loglevel" % "1.8.1-c810c5",
  "org.scalablytyped" %%% "ms" % "v0.7.1-dt-20220818Z-c5fb11",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-def929",
  "org.scalablytyped" %%% "puppeteer-core" % "19.2.2-2319d5",
  "org.scalablytyped" %%% "std" % "4.9-5f989f",
  "org.scalablytyped" %%% "typescript" % "4.9.3-52822d",
  "org.scalablytyped" %%% "wdio__logger" % "7.26.0-c20b8b",
  "org.scalablytyped" %%% "wdio__protocols" % "7.22.0-0fa397",
  "org.scalablytyped" %%% "wdio__types" % "7.26.0-e788eb",
  "org.scalablytyped" %%% "webdriver" % "7.26.0-daafba",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20220624Z-3574d0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
