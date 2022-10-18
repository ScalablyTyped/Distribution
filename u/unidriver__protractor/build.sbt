organization := "org.scalablytyped"
name := "unidriver__protractor"
version := "3.1.0-24b577"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "blocking-proxy" % "1.0.1-5bc5fc",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221015Z-0a42ca",
  "org.scalablytyped" %%% "protractor" % "7.0.0-e4c788",
  "org.scalablytyped" %%% "q" % "1.5-dt-20220819Z-1566b2",
  "org.scalablytyped" %%% "selenium-webdriver" % "4.1-dt-20220909Z-a87c96",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "unidriver__core" % "1.3.0-e29d24",
  "org.scalablytyped" %%% "webdriver-js-extender" % "2.2.0-45b692",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20220624Z-54fbe6")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
