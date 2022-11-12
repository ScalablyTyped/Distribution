organization := "org.scalablytyped"
name := "y-leveldb"
version := "0.1.1-cc24fd"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "buffer" % "6.0.3-bfb740",
  "org.scalablytyped" %%% "lib0" % "0.2.52-ddece1",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-86f548",
  "org.scalablytyped" %%% "rollup" % "3.3.0-ebfd9f",
  "org.scalablytyped" %%% "std" % "4.8-686d1d",
  "org.scalablytyped" %%% "yjs" % "13.5.42-7bcb45")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
