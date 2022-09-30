organization := "org.scalablytyped"
name := "testcafe-reporter-dashboard"
version := "0.2.7-rc.1-3f1cc1"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "fp-ts" % "2.12.3-81fb10",
  "org.scalablytyped" %%% "io-ts" % "2.2.18-85e155",
  "org.scalablytyped" %%% "io-ts-types" % "0.5.17-409b27",
  "org.scalablytyped" %%% "monocle-ts" % "2.3.13-008c59",
  "org.scalablytyped" %%% "newtype-ts" % "0.3.5-207e1d",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
