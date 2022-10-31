organization := "org.scalablytyped"
name := "unidriver__protractor"
version := "3.1.0-a37147"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "blocking-proxy" % "1.0.1-448708",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221030Z-57fc1b",
  "org.scalablytyped" %%% "protractor" % "7.0.0-eae279",
  "org.scalablytyped" %%% "q" % "1.5-dt-20220819Z-96a756",
  "org.scalablytyped" %%% "selenium-webdriver" % "4.1-dt-20221018Z-7d374b",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "unidriver__core" % "1.3.0-540a8e",
  "org.scalablytyped" %%% "webdriver-js-extender" % "2.2.0-7c4666",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20220624Z-cacb98")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
