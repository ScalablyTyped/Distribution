organization := "org.scalablytyped"
name := "unidriver__puppeteer"
version := "2.2.7-9e2b05"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20211202Z-d881d1",
  "org.scalablytyped" %%% "devtools-protocol" % "0.0.1059612-10d27d",
  "org.scalablytyped" %%% "ms" % "v0.7.1-dt-20220818Z-0be45f",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221018Z-1e532a",
  "org.scalablytyped" %%% "puppeteer" % "19.0.0-3909f0",
  "org.scalablytyped" %%% "puppeteer-core" % "19.0.0-2cdc55",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "unidriver__core" % "1.3.0-e29d24",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20220624Z-0f048d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
