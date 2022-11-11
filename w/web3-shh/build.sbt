organization := "org.scalablytyped"
name := "web3-shh"
version := "1.8.1-2fe48a"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bignumber_dot_js" % "9.1.0-85e343",
  "org.scalablytyped" %%% "bn_dot_js" % "5.1-dt-20220829Z-7779ac",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-86f548",
  "org.scalablytyped" %%% "std" % "4.8-686d1d",
  "org.scalablytyped" %%% "web3-core" % "1.8.1-3826da",
  "org.scalablytyped" %%% "web3-core-helpers" % "1.8.1-68b6a5",
  "org.scalablytyped" %%% "web3-core-method" % "1.8.1-d8d97a",
  "org.scalablytyped" %%% "web3-net" % "1.8.1-70de8d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
