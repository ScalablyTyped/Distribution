organization := "org.scalablytyped"
name := "sync-request"
version := "6.1.0-05b90d"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "form-data" % "4.0.0-24b0ef",
  "org.scalablytyped" %%% "http-basic" % "8.1.3-72388e",
  "org.scalablytyped" %%% "http-response-object" % "3.0.2-00d5b2",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-4346d8",
  "org.scalablytyped" %%% "promise" % "8.3.0-19b20a",
  "org.scalablytyped" %%% "std" % "4.9-c133ce",
  "org.scalablytyped" %%% "then-request" % "6.0.2-fe8174")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
