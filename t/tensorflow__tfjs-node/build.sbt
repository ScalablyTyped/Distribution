organization := "org.scalablytyped"
name := "tensorflow__tfjs-node"
version := "2.7.0-1ca282"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-e00132",
  "org.scalablytyped" %%% "std" % "4.1-2f6855",
  "org.scalablytyped" %%% "tensorflow__tfjs" % "2.7.0-ab65dc",
  "org.scalablytyped" %%% "tensorflow__tfjs-converter" % "2.7.0-b8c256",
  "org.scalablytyped" %%% "tensorflow__tfjs-core" % "2.7.0-e05330",
  "org.scalablytyped" %%% "tensorflow__tfjs-data" % "2.7.0-386ddc",
  "org.scalablytyped" %%% "tensorflow__tfjs-layers" % "2.7.0-40e8a5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
