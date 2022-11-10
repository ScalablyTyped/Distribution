organization := "org.scalablytyped"
name := "unidriver__protractor"
version := "3.1.0-d8fe0c"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "blocking-proxy" % "1.0.1-d7c891",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-86f548",
  "org.scalablytyped" %%% "protractor" % "7.0.0-3063fd",
  "org.scalablytyped" %%% "q" % "1.5-dt-20220819Z-934aed",
  "org.scalablytyped" %%% "selenium-webdriver" % "4.1-dt-20221108Z-e7ea9b",
  "org.scalablytyped" %%% "std" % "4.8-686d1d",
  "org.scalablytyped" %%% "unidriver__core" % "1.3.0-42e5ad",
  "org.scalablytyped" %%% "webdriver-js-extender" % "2.2.0-1571f1",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20220624Z-38b082")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
