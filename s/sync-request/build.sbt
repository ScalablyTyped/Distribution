organization := "org.scalablytyped"
name := "sync-request"
version := "6.1.0-26e715"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "form-data" % "4.0.0-3a5157",
  "org.scalablytyped" %%% "http-basic" % "8.1.3-54010d",
  "org.scalablytyped" %%% "http-response-object" % "3.0.2-5301b7",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221024Z-2be228",
  "org.scalablytyped" %%% "promise" % "8.2.0-960f7c",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "then-request" % "6.0.2-3b2856")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
