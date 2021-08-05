organization := "org.scalablytyped"
name := "unidriver__protractor"
version := "1.1.7-1458de"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "blocking-proxy" % "1.0.1-0004db",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-e00132",
  "org.scalablytyped" %%% "protractor" % "7.0.0-4a4b6f",
  "org.scalablytyped" %%% "q" % "1.5-dt-20201002Z-335752",
  "org.scalablytyped" %%% "selenium-webdriver" % "4.0-dt-20201028Z-295067",
  "org.scalablytyped" %%% "std" % "4.1-2f6855",
  "org.scalablytyped" %%% "unidriver__core" % "1.2.1-aea57c",
  "org.scalablytyped" %%% "webdriver-js-extender" % "2.1.0-5464b7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
