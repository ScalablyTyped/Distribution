organization := "org.scalablytyped"
name := "sync-request"
version := "6.1.0-5df45b"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "form-data" % "4.0.0-a495ff",
  "org.scalablytyped" %%% "http-basic" % "8.1.3-a4f70f",
  "org.scalablytyped" %%% "http-response-object" % "3.0.2-c21c35",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221026Z-107efe",
  "org.scalablytyped" %%% "promise" % "8.3.0-842797",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "then-request" % "6.0.2-c52dfb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
