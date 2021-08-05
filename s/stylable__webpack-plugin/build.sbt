organization := "org.scalablytyped"
name := "stylable__webpack-plugin"
version := "3.6.2-dcec11"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-e00132",
  "org.scalablytyped" %%% "postcss" % "7.0.35-5779b1",
  "org.scalablytyped" %%% "source-map" % "0.7.3-e38674",
  "org.scalablytyped" %%% "std" % "4.1-2f6855",
  "org.scalablytyped" %%% "stylable__core" % "3.11.7-12cf11",
  "org.scalablytyped" %%% "stylable__optimizer" % "3.11.7-976f82",
  "org.scalablytyped" %%% "webpack-sources" % "2.0-dt-20200930Z-a464c3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
