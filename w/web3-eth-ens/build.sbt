organization := "org.scalablytyped"
name := "web3-eth-ens"
version := "1.8.1-46438d"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bignumber_dot_js" % "9.1.0-f136c2",
  "org.scalablytyped" %%% "bn_dot_js" % "5.1-dt-20220829Z-f7058c",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-874609",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb",
  "org.scalablytyped" %%% "web3-core" % "1.8.1-451fe7",
  "org.scalablytyped" %%% "web3-core-helpers" % "1.8.1-dc0b39",
  "org.scalablytyped" %%% "web3-core-method" % "1.8.1-7bee89",
  "org.scalablytyped" %%% "web3-eth-accounts" % "1.8.1-acdb6b",
  "org.scalablytyped" %%% "web3-eth-contract" % "1.8.1-78aaa6",
  "org.scalablytyped" %%% "web3-utils" % "1.8.1-88b523")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
