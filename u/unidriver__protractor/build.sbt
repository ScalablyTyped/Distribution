organization := "org.scalablytyped"
name := "unidriver__protractor"
version := "1.1.7-8d8b52"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "blocking-proxy" % "1.0.1-d04ec0",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-11c649",
  "org.scalablytyped" %%% "protractor" % "7.0.0-d6a9bd",
  "org.scalablytyped" %%% "q" % "1.5-dt-20201002Z-a93b2a",
  "org.scalablytyped" %%% "selenium-webdriver" % "4.0-dt-20201028Z-4ada20",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab",
  "org.scalablytyped" %%% "unidriver__core" % "1.2.1-249204",
  "org.scalablytyped" %%% "webdriver-js-extender" % "2.1.0-1cbdbb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
