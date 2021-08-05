organization := "org.scalablytyped"
name := "webpack-dev-middleware"
version := "3.7-dt-20200818Z-072cb9"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20201002Z-a4b6e2",
  "org.scalablytyped" %%% "loglevel" % "1.7.0-18e3de",
  "org.scalablytyped" %%% "memory-fs" % "0.3.0-dt-20201002Z-26b8b4",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-e00132",
  "org.scalablytyped" %%% "std" % "4.1-2f6855")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
