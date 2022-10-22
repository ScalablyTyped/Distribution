organization := "org.scalablytyped"
name := "y-protocols"
version := "1.0.5-761367"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "lib0" % "0.2.52-5f5655",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221020Z-d73de4",
  "org.scalablytyped" %%% "rollup" % "3.2.3-eed8d7",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "yjs" % "13.5.41-dd7764")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
