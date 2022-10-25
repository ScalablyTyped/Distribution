organization := "org.scalablytyped"
name := "unidriver__protractor"
version := "3.1.0-9b80a4"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "blocking-proxy" % "1.0.1-47cb45",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221024Z-2be228",
  "org.scalablytyped" %%% "protractor" % "7.0.0-583f2b",
  "org.scalablytyped" %%% "q" % "1.5-dt-20220819Z-96a756",
  "org.scalablytyped" %%% "selenium-webdriver" % "4.1-dt-20221018Z-9b7283",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "unidriver__core" % "1.3.0-540a8e",
  "org.scalablytyped" %%% "webdriver-js-extender" % "2.2.0-f05ddc",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20220624Z-3e4a2a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
