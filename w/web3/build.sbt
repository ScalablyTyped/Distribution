organization := "org.scalablytyped"
name := "web3"
version := "1.8.0-078a18"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bignumber_dot_js" % "9.1.0-08f9c6",
  "org.scalablytyped" %%% "bn_dot_js" % "5.1-dt-20220829Z-f81231",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221023Z-05fcff",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "web3-bzz" % "1.8.0-b8b9c8",
  "org.scalablytyped" %%% "web3-core" % "1.8.0-99f9ef",
  "org.scalablytyped" %%% "web3-core-helpers" % "1.8.0-c5aee9",
  "org.scalablytyped" %%% "web3-core-method" % "1.8.0-05697e",
  "org.scalablytyped" %%% "web3-core-subscriptions" % "1.8.0-e7f17e",
  "org.scalablytyped" %%% "web3-eth" % "1.8.0-55a40d",
  "org.scalablytyped" %%% "web3-eth-abi" % "1.8.0-56841c",
  "org.scalablytyped" %%% "web3-eth-accounts" % "1.8.0-be7708",
  "org.scalablytyped" %%% "web3-eth-contract" % "1.8.0-261f96",
  "org.scalablytyped" %%% "web3-eth-ens" % "1.8.0-d70e48",
  "org.scalablytyped" %%% "web3-eth-iban" % "1.8.0-428945",
  "org.scalablytyped" %%% "web3-eth-personal" % "1.8.0-82689c",
  "org.scalablytyped" %%% "web3-net" % "1.8.0-9c5a55",
  "org.scalablytyped" %%% "web3-shh" % "1.8.0-5d7488",
  "org.scalablytyped" %%% "web3-utils" % "1.8.0-d6e11d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
