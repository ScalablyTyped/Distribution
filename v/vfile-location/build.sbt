organization := "org.scalablytyped"
name := "vfile-location"
version := "2.0-dt-20200823Z-8d346f"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab",
  "org.scalablytyped" %%% "unist" % "2.0-dt-20190213Z-97095f",
  "org.scalablytyped" %%% "vfile" % "4.2.0-5c0bd1",
  "org.scalablytyped" %%% "vfile-message" % "2.0.4-454368")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
