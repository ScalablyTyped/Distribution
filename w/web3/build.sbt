organization := "org.scalablytyped"
name := "web3"
version := "1.3.0-341a8c"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bignumber_dot_js" % "9.0.1-df05c6",
  "org.scalablytyped" %%% "bn_dot_js" % "4.11-dt-20200515Z-33054c",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-814aa8",
  "org.scalablytyped" %%% "std" % "4.1-044efb",
  "org.scalablytyped" %%% "web3-bzz" % "1.3.0-1442ea",
  "org.scalablytyped" %%% "web3-core" % "1.3.0-6aaa9f",
  "org.scalablytyped" %%% "web3-core-helpers" % "1.3.0-8d6686",
  "org.scalablytyped" %%% "web3-core-method" % "1.3.0-c7dda6",
  "org.scalablytyped" %%% "web3-core-subscriptions" % "1.3.0-d81598",
  "org.scalablytyped" %%% "web3-eth" % "1.3.0-f74bd4",
  "org.scalablytyped" %%% "web3-eth-abi" % "1.3.0-7d0d9c",
  "org.scalablytyped" %%% "web3-eth-accounts" % "1.3.0-f41465",
  "org.scalablytyped" %%% "web3-eth-contract" % "1.3.0-336324",
  "org.scalablytyped" %%% "web3-eth-ens" % "1.3.0-d149b8",
  "org.scalablytyped" %%% "web3-eth-iban" % "1.3.0-f5b689",
  "org.scalablytyped" %%% "web3-eth-personal" % "1.3.0-ab3fad",
  "org.scalablytyped" %%% "web3-net" % "1.3.0-159ead",
  "org.scalablytyped" %%% "web3-shh" % "1.3.0-846b50",
  "org.scalablytyped" %%% "web3-utils" % "1.3.0-d8bec1")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
