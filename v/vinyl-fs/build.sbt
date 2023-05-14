organization := "org.scalablytyped"
name := "vinyl-fs"
version := "3.0-dt-20230510Z-c2a1b9"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "glob-stream" % "v8.0.0-dt-20230510Z-846c6c",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230513Z-b25634",
  "org.scalablytyped" %%% "picomatch" % "2.3-dt-20211202Z-284a14",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "streamx" % "2.9-dt-20220624Z-19f445",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20221107Z-481065")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
