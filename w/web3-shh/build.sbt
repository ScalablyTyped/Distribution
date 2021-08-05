organization := "org.scalablytyped"
name := "web3-shh"
version := "1.3.0-6d295e"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bignumber_dot_js" % "9.0.1-719e40",
  "org.scalablytyped" %%% "bn_dot_js" % "4.11-dt-20200515Z-919a86",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-e00132",
  "org.scalablytyped" %%% "std" % "4.1-2f6855",
  "org.scalablytyped" %%% "web3-core" % "1.3.0-58a860",
  "org.scalablytyped" %%% "web3-core-helpers" % "1.3.0-90a72b",
  "org.scalablytyped" %%% "web3-core-method" % "1.3.0-b9c65b",
  "org.scalablytyped" %%% "web3-net" % "1.3.0-ad7559")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
