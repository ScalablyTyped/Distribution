organization := "org.scalablytyped"
name := "testcafe-reporter-dashboard"
version := "0.2.7-rc.1-33b301"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "fp-ts" % "2.15.0-162c7c",
  "org.scalablytyped" %%% "io-ts" % "2.2.20-49cee5",
  "org.scalablytyped" %%% "io-ts-types" % "0.5.17-a63cb8",
  "org.scalablytyped" %%% "monocle-ts" % "2.3.13-b59fe4",
  "org.scalablytyped" %%% "newtype-ts" % "0.3.5-48cad4",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
