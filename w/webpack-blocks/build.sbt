organization := "org.scalablytyped"
name := "webpack-blocks"
version := "2.0-dt-20200925Z-b34d73"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "source-map" % "0.7.3-081b8e",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab",
  "org.scalablytyped" %%% "uglify-js" % "3.11-dt-20201027Z-874dd1",
  "org.scalablytyped" %%% "webpack-blocks__assets" % "2.0-dt-20200925Z-1a55ce",
  "org.scalablytyped" %%% "webpack-blocks__babel" % "2.0-dt-20200925Z-f0a649",
  "org.scalablytyped" %%% "webpack-blocks__core" % "2.0-dt-20200925Z-859c64",
  "org.scalablytyped" %%% "webpack-blocks__dev-server" % "2.0-dt-20200925Z-8c8b2d",
  "org.scalablytyped" %%% "webpack-blocks__postcss" % "2.0-dt-20200925Z-d4513d",
  "org.scalablytyped" %%% "webpack-blocks__sass" % "2.0-dt-20200925Z-147dd3",
  "org.scalablytyped" %%% "webpack-blocks__typescript" % "2.0-dt-20200925Z-db7e01",
  "org.scalablytyped" %%% "webpack-blocks__uglify" % "2.0-dt-20200925Z-fbdeae",
  "org.scalablytyped" %%% "webpack-blocks__webpack" % "2.0-dt-20200925Z-ee7e75")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
