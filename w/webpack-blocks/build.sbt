organization := "org.scalablytyped"
name := "webpack-blocks"
version := "2.0-dt-20200925Z-5f0759"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "source-map" % "0.7.3-755fd4",
  "org.scalablytyped" %%% "std" % "4.1-044efb",
  "org.scalablytyped" %%% "uglify-js" % "3.11-dt-20201027Z-324923",
  "org.scalablytyped" %%% "webpack-blocks__assets" % "2.0-dt-20200925Z-228c2d",
  "org.scalablytyped" %%% "webpack-blocks__babel" % "2.0-dt-20200925Z-aa25f2",
  "org.scalablytyped" %%% "webpack-blocks__core" % "2.0-dt-20200925Z-8a2f87",
  "org.scalablytyped" %%% "webpack-blocks__dev-server" % "2.0-dt-20200925Z-e054b0",
  "org.scalablytyped" %%% "webpack-blocks__postcss" % "2.0-dt-20200925Z-3718e4",
  "org.scalablytyped" %%% "webpack-blocks__sass" % "2.0-dt-20200925Z-52829d",
  "org.scalablytyped" %%% "webpack-blocks__typescript" % "2.0-dt-20200925Z-ad7601",
  "org.scalablytyped" %%% "webpack-blocks__uglify" % "2.0-dt-20200925Z-a84ec8",
  "org.scalablytyped" %%% "webpack-blocks__webpack" % "2.0-dt-20200925Z-d113c5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
