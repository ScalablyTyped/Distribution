organization := "org.scalablytyped"
name := "web3-eth"
version := "1.8.0-8f74b5"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bignumber_dot_js" % "9.1.0-85e343",
  "org.scalablytyped" %%% "bn_dot_js" % "5.1-dt-20220829Z-7779ac",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-86f548",
  "org.scalablytyped" %%% "std" % "4.8-686d1d",
  "org.scalablytyped" %%% "web3-core" % "1.8.0-a89af5",
  "org.scalablytyped" %%% "web3-core-helpers" % "1.8.0-7b3c7c",
  "org.scalablytyped" %%% "web3-core-method" % "1.8.0-fab06e",
  "org.scalablytyped" %%% "web3-core-subscriptions" % "1.8.0-7a5469",
  "org.scalablytyped" %%% "web3-eth-abi" % "1.8.0-a41279",
  "org.scalablytyped" %%% "web3-eth-accounts" % "1.8.0-c0dcca",
  "org.scalablytyped" %%% "web3-eth-contract" % "1.8.0-a1ebbe",
  "org.scalablytyped" %%% "web3-eth-ens" % "1.8.0-2ce9f3",
  "org.scalablytyped" %%% "web3-eth-iban" % "1.8.0-428945",
  "org.scalablytyped" %%% "web3-eth-personal" % "1.8.0-8f03e4",
  "org.scalablytyped" %%% "web3-net" % "1.8.0-53f0d3",
  "org.scalablytyped" %%% "web3-utils" % "1.8.0-e54cbe")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
