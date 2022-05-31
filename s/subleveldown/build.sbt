organization := "org.scalablytyped"
name := "subleveldown"
version := "4.1-dt-20191226Z-58171c"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "abstract-leveldown" % "5.0-dt-20180913Z-dcb85b",
  "org.scalablytyped" %%% "level-codec" % "9.0-dt-20200515Z-c44c6f",
  "org.scalablytyped" %%% "levelup" % "4.3-dt-20201002Z-d13072",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-11c649",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
