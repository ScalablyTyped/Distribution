organization := "org.scalablytyped"
name := "webpack-blocks"
version := "2.0-dt-20200925Z-b85be3"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "source-map" % "0.7.3-e38674",
  "org.scalablytyped" %%% "std" % "4.1-2f6855",
  "org.scalablytyped" %%% "uglify-js" % "3.11-dt-20201027Z-91a483",
  "org.scalablytyped" %%% "webpack-blocks__assets" % "2.0-dt-20200925Z-449bca",
  "org.scalablytyped" %%% "webpack-blocks__babel" % "2.0-dt-20200925Z-7de337",
  "org.scalablytyped" %%% "webpack-blocks__core" % "2.0-dt-20200925Z-4d5ebc",
  "org.scalablytyped" %%% "webpack-blocks__dev-server" % "2.0-dt-20200925Z-95db2f",
  "org.scalablytyped" %%% "webpack-blocks__postcss" % "2.0-dt-20200925Z-531d74",
  "org.scalablytyped" %%% "webpack-blocks__sass" % "2.0-dt-20200925Z-f1a396",
  "org.scalablytyped" %%% "webpack-blocks__typescript" % "2.0-dt-20200925Z-594c06",
  "org.scalablytyped" %%% "webpack-blocks__uglify" % "2.0-dt-20200925Z-76f1ed",
  "org.scalablytyped" %%% "webpack-blocks__webpack" % "2.0-dt-20200925Z-819c10")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
