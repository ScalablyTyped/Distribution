organization := "org.scalablytyped"
name := "subleveldown"
version := "4.1-dt-20191226Z-07d808"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "abstract-leveldown" % "5.0-dt-20180913Z-de56b6",
  "org.scalablytyped" %%% "level-codec" % "9.0-dt-20200515Z-7b8796",
  "org.scalablytyped" %%% "levelup" % "4.3-dt-20201002Z-5fbe83",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-814aa8",
  "org.scalablytyped" %%% "std" % "4.1-044efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
