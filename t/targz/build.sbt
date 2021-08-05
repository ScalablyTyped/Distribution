organization := "org.scalablytyped"
name := "targz"
version := "1.0-dt-20190621Z-9f43fb"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-e00132",
  "org.scalablytyped" %%% "std" % "4.1-2f6855",
  "org.scalablytyped" %%% "tar-fs" % "2.0-dt-20200515Z-6287a8",
  "org.scalablytyped" %%% "tar-stream" % "2.1-dt-20200302Z-271518")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
