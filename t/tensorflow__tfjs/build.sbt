organization := "org.scalablytyped"
name := "tensorflow__tfjs"
version := "2.7.0-931ce4"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab",
  "org.scalablytyped" %%% "tensorflow__tfjs-converter" % "2.7.0-658571",
  "org.scalablytyped" %%% "tensorflow__tfjs-core" % "2.7.0-204dd6",
  "org.scalablytyped" %%% "tensorflow__tfjs-data" % "2.7.0-21274b",
  "org.scalablytyped" %%% "tensorflow__tfjs-layers" % "2.7.0-758338")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
