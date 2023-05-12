organization := "org.scalablytyped"
name := "swc-node__register"
version := "1.5.4-2373ab"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "swc-node__core" % "1.9.1-ad0f86",
  "org.scalablytyped" %%% "swc__core" % "1.3.10-458a2e",
  "org.scalablytyped" %%% "typescript" % "5.0.4-f7d5cf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
