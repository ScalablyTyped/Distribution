organization := "org.scalablytyped"
name := "web3"
version := "1.3.0-1a4e12"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bignumber_dot_js" % "9.0.1-49f33c",
  "org.scalablytyped" %%% "bn_dot_js" % "4.11-dt-20200515Z-eae40c",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-11c649",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab",
  "org.scalablytyped" %%% "web3-bzz" % "1.3.0-ffacf6",
  "org.scalablytyped" %%% "web3-core" % "1.3.0-058af8",
  "org.scalablytyped" %%% "web3-core-helpers" % "1.3.0-511961",
  "org.scalablytyped" %%% "web3-core-method" % "1.3.0-4a38ca",
  "org.scalablytyped" %%% "web3-core-subscriptions" % "1.3.0-d805f9",
  "org.scalablytyped" %%% "web3-eth" % "1.3.0-2fa394",
  "org.scalablytyped" %%% "web3-eth-abi" % "1.3.0-23dbed",
  "org.scalablytyped" %%% "web3-eth-accounts" % "1.3.0-4e7aba",
  "org.scalablytyped" %%% "web3-eth-contract" % "1.3.0-e5549a",
  "org.scalablytyped" %%% "web3-eth-ens" % "1.3.0-8c9dcf",
  "org.scalablytyped" %%% "web3-eth-iban" % "1.3.0-864d45",
  "org.scalablytyped" %%% "web3-eth-personal" % "1.3.0-5b0b01",
  "org.scalablytyped" %%% "web3-net" % "1.3.0-270601",
  "org.scalablytyped" %%% "web3-shh" % "1.3.0-665a6d",
  "org.scalablytyped" %%% "web3-utils" % "1.3.0-8939a5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
