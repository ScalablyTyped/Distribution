organization := "org.scalablytyped"
name := "web3"
version := "1.8.1-05ebea"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bignumber_dot_js" % "9.1.0-f136c2",
  "org.scalablytyped" %%% "bn_dot_js" % "5.1-dt-20220829Z-f7058c",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-874609",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb",
  "org.scalablytyped" %%% "web3-bzz" % "1.8.1-294856",
  "org.scalablytyped" %%% "web3-core" % "1.8.1-451fe7",
  "org.scalablytyped" %%% "web3-core-helpers" % "1.8.1-dc0b39",
  "org.scalablytyped" %%% "web3-core-method" % "1.8.1-7bee89",
  "org.scalablytyped" %%% "web3-core-subscriptions" % "1.8.1-6d4e7f",
  "org.scalablytyped" %%% "web3-eth" % "1.8.1-371d51",
  "org.scalablytyped" %%% "web3-eth-abi" % "1.8.1-1562bc",
  "org.scalablytyped" %%% "web3-eth-accounts" % "1.8.1-acdb6b",
  "org.scalablytyped" %%% "web3-eth-contract" % "1.8.1-78aaa6",
  "org.scalablytyped" %%% "web3-eth-ens" % "1.8.1-46438d",
  "org.scalablytyped" %%% "web3-eth-iban" % "1.8.1-fc0547",
  "org.scalablytyped" %%% "web3-eth-personal" % "1.8.1-f555fc",
  "org.scalablytyped" %%% "web3-net" % "1.8.1-e2cbcd",
  "org.scalablytyped" %%% "web3-shh" % "1.8.1-fe40d4",
  "org.scalablytyped" %%% "web3-utils" % "1.8.1-88b523")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
