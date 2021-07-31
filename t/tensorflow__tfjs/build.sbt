organization := "org.scalablytyped"
name := "tensorflow__tfjs"
version := "2.7.0-c7148b"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "std" % "4.1-044efb",
  "org.scalablytyped" %%% "tensorflow__tfjs-converter" % "2.7.0-13e4a7",
  "org.scalablytyped" %%% "tensorflow__tfjs-core" % "2.7.0-018315",
  "org.scalablytyped" %%% "tensorflow__tfjs-data" % "2.7.0-30c785",
  "org.scalablytyped" %%% "tensorflow__tfjs-layers" % "2.7.0-e2f3ec")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
