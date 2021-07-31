organization := "org.scalablytyped"
name := "stylable__webpack-plugin"
version := "3.6.2-6fe96e"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-814aa8",
  "org.scalablytyped" %%% "postcss" % "7.0.35-bd5010",
  "org.scalablytyped" %%% "source-map" % "0.7.3-755fd4",
  "org.scalablytyped" %%% "std" % "4.1-044efb",
  "org.scalablytyped" %%% "stylable__core" % "3.11.7-95aec8",
  "org.scalablytyped" %%% "stylable__optimizer" % "3.11.7-62d5ca",
  "org.scalablytyped" %%% "webpack-sources" % "2.0-dt-20200930Z-033cf5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
