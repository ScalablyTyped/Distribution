organization := "org.scalablytyped"
name := "yog2-kernel"
version := "1.9-dt-20211202Z-9fedfe"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-a77eec",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-80f63d",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20220928Z-3598f3",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-3b1911",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221023Z-05fcff",
  "org.scalablytyped" %%% "node-ral" % "0.18-dt-20211202Z-097331",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-33ed42",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-5b9e43",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "yog-bigpipe" % "0.4-dt-20220110Z-04668b",
  "org.scalablytyped" %%% "yog-log" % "0.1-dt-20211202Z-d5717c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
