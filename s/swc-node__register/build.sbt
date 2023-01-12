organization := "org.scalablytyped"
name := "swc-node__register"
version := "1.5.4-96d275"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb",
  "org.scalablytyped" %%% "swc-node__core" % "1.9.1-38be51",
  "org.scalablytyped" %%% "swc__core" % "1.3.10-2f3f06",
  "org.scalablytyped" %%% "typescript" % "4.9.3-94f598")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
