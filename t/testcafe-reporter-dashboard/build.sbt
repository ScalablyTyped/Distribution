organization := "org.scalablytyped"
name := "testcafe-reporter-dashboard"
version := "0.2.7-rc.1-7d9e00"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "fp-ts" % "2.13.1-364db8",
  "org.scalablytyped" %%% "io-ts" % "2.2.19-a70316",
  "org.scalablytyped" %%% "io-ts-types" % "0.5.17-9484e4",
  "org.scalablytyped" %%% "monocle-ts" % "2.3.13-4a7ff2",
  "org.scalablytyped" %%% "newtype-ts" % "0.3.5-a79ab4",
  "org.scalablytyped" %%% "std" % "4.9-c133ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
