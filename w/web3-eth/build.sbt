organization := "org.scalablytyped"
name := "web3-eth"
version := "1.8.1-756e07"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bignumber_dot_js" % "9.1.0-26a25f",
  "org.scalablytyped" %%% "bn_dot_js" % "5.1-dt-20220829Z-492205",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-4346d8",
  "org.scalablytyped" %%% "std" % "4.9-c133ce",
  "org.scalablytyped" %%% "web3-core" % "1.8.1-2c6575",
  "org.scalablytyped" %%% "web3-core-helpers" % "1.8.1-4a40cf",
  "org.scalablytyped" %%% "web3-core-method" % "1.8.1-a18952",
  "org.scalablytyped" %%% "web3-core-subscriptions" % "1.8.1-e2ddf6",
  "org.scalablytyped" %%% "web3-eth-abi" % "1.8.1-2403db",
  "org.scalablytyped" %%% "web3-eth-accounts" % "1.8.1-e675b7",
  "org.scalablytyped" %%% "web3-eth-contract" % "1.8.1-fca43f",
  "org.scalablytyped" %%% "web3-eth-ens" % "1.8.1-4b32e1",
  "org.scalablytyped" %%% "web3-eth-iban" % "1.8.1-793e5f",
  "org.scalablytyped" %%% "web3-eth-personal" % "1.8.1-46acb2",
  "org.scalablytyped" %%% "web3-net" % "1.8.1-b26c30",
  "org.scalablytyped" %%% "web3-utils" % "1.8.1-f14d9b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
