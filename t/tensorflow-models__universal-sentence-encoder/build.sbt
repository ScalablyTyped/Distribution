organization := "org.scalablytyped"
name := "tensorflow-models__universal-sentence-encoder"
version := "1.3.2-765688"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "std" % "4.1-2f6855",
  "org.scalablytyped" %%% "tensorflow__tfjs-converter" % "2.7.0-b8c256",
  "org.scalablytyped" %%% "tensorflow__tfjs-core" % "2.7.0-e05330")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
