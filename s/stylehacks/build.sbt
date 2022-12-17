organization := "org.scalablytyped"
name := "stylehacks"
version := "5.1.1-4b7f89"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "postcss" % "8.4.19-076895",
  "org.scalablytyped" %%% "postcss-selector-parser" % "6.0.10-f80804",
  "org.scalablytyped" %%% "source-map-js" % "1.0.2-8ee3e9",
  "org.scalablytyped" %%% "std" % "4.9-5f989f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
