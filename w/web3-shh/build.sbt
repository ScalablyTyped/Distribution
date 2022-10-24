organization := "org.scalablytyped"
name := "web3-shh"
version := "1.8.0-5d7488"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bignumber_dot_js" % "9.1.0-08f9c6",
  "org.scalablytyped" %%% "bn_dot_js" % "5.1-dt-20220829Z-f81231",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221023Z-05fcff",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "web3-core" % "1.8.0-99f9ef",
  "org.scalablytyped" %%% "web3-core-helpers" % "1.8.0-c5aee9",
  "org.scalablytyped" %%% "web3-core-method" % "1.8.0-05697e",
  "org.scalablytyped" %%% "web3-net" % "1.8.0-9c5a55")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
