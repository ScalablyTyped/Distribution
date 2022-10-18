organization := "org.scalablytyped"
name := "swc-node__register"
version := "1.5.1-335cbc"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "swc-node__core" % "1.9.0-ae23f2",
  "org.scalablytyped" %%% "swc__core" % "1.3.2-be8c2c",
  "org.scalablytyped" %%% "typescript" % "4.8.4-676e37")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
