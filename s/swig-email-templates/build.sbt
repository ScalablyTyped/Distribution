organization := "org.scalablytyped"
name := "swig-email-templates"
version := "5.0-dt-20200227Z-fe6e0a"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "jquery" % "3.5-dt-20201028Z-b65a9c",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20201002Z-00b6a0",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab",
  "org.scalablytyped" %%% "swig" % "0.0-unknown-dt-20201002Z-e09fa8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
