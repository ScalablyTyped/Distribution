organization := "org.scalablytyped"
name := "web3-shh"
version := "1.8.1-755905"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bignumber_dot_js" % "9.1.0-2aff21",
  "org.scalablytyped" %%% "bn_dot_js" % "5.1-dt-20220829Z-a01ba4",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-def929",
  "org.scalablytyped" %%% "std" % "4.9-5f989f",
  "org.scalablytyped" %%% "web3-core" % "1.8.1-18ceb5",
  "org.scalablytyped" %%% "web3-core-helpers" % "1.8.1-319ec5",
  "org.scalablytyped" %%% "web3-core-method" % "1.8.1-a14ec6",
  "org.scalablytyped" %%% "web3-net" % "1.8.1-691e2a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
