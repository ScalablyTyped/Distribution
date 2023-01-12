organization := "org.scalablytyped"
name := "sync-request"
version := "6.1.0-5d1e18"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "form-data" % "4.0.0-987bd0",
  "org.scalablytyped" %%% "http-basic" % "8.1.3-a7145d",
  "org.scalablytyped" %%% "http-response-object" % "3.0.2-27b90e",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-874609",
  "org.scalablytyped" %%% "promise" % "8.3.0-90c26f",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb",
  "org.scalablytyped" %%% "then-request" % "6.0.2-f5cc7a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
