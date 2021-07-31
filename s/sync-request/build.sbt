organization := "org.scalablytyped"
name := "sync-request"
version := "6.1.0-7cc400"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "form-data" % "3.0.0-1b5b63",
  "org.scalablytyped" %%% "http-basic" % "8.1.3-586ff6",
  "org.scalablytyped" %%% "http-response-object" % "3.0.2-23250f",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-814aa8",
  "org.scalablytyped" %%% "promise" % "7.3.1-f066ab",
  "org.scalablytyped" %%% "std" % "4.1-044efb",
  "org.scalablytyped" %%% "then-request" % "6.0.2-faafb9")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
