organization := "org.scalablytyped"
name := "unidriver__protractor"
version := "3.1.0-3159c7"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "blocking-proxy" % "1.0.1-2942c6",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220926Z-d201ab",
  "org.scalablytyped" %%% "protractor" % "7.0.0-cb0639",
  "org.scalablytyped" %%% "q" % "1.5-dt-20220819Z-1ac3b1",
  "org.scalablytyped" %%% "selenium-webdriver" % "4.1-dt-20220909Z-afa19c",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb",
  "org.scalablytyped" %%% "unidriver__core" % "1.3.0-e497ae",
  "org.scalablytyped" %%% "webdriver-js-extender" % "2.2.0-28cac5",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20220624Z-142b86")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
