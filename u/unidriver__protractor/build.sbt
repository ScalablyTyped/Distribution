organization := "org.scalablytyped"
name := "unidriver__protractor"
version := "3.1.0-52a41b"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "blocking-proxy" % "1.0.1-b2d166",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230513Z-b25634",
  "org.scalablytyped" %%% "protractor" % "7.0.0-90b451",
  "org.scalablytyped" %%% "q" % "1.5-dt-20221230Z-f67b26",
  "org.scalablytyped" %%% "selenium-webdriver" % "4.1-dt-20230429Z-65c886",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "unidriver__core" % "1.3.0-9e32be",
  "org.scalablytyped" %%% "webdriver-js-extender" % "2.2.0-983287",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20221230Z-6a0345")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
