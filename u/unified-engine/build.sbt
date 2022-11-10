organization := "org.scalablytyped"
name := "unified-engine"
version := "10.0.1-a18af6"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-86f548",
  "org.scalablytyped" %%% "std" % "4.8-686d1d",
  "org.scalablytyped" %%% "trough" % "2.1.0-b0abc0",
  "org.scalablytyped" %%% "unified" % "10.1.2-6a23f2",
  "org.scalablytyped" %%% "unist" % "2.0-dt-20220624Z-cacd8c",
  "org.scalablytyped" %%% "vfile" % "5.3.5-ab363b",
  "org.scalablytyped" %%% "vfile-message" % "3.1.2-222455")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
