organization := "org.scalablytyped"
name := "web3-eth"
version := "1.8.0-3b3bfe"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bignumber_dot_js" % "9.1.0-251330",
  "org.scalablytyped" %%% "bn_dot_js" % "5.1-dt-20220829Z-a32a49",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221020Z-d73de4",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "web3-core" % "1.8.0-e29b5c",
  "org.scalablytyped" %%% "web3-core-helpers" % "1.8.0-05b959",
  "org.scalablytyped" %%% "web3-core-method" % "1.8.0-8237f3",
  "org.scalablytyped" %%% "web3-core-subscriptions" % "1.8.0-54a30c",
  "org.scalablytyped" %%% "web3-eth-abi" % "1.8.0-e0a87c",
  "org.scalablytyped" %%% "web3-eth-accounts" % "1.8.0-83bc53",
  "org.scalablytyped" %%% "web3-eth-contract" % "1.8.0-de42ea",
  "org.scalablytyped" %%% "web3-eth-ens" % "1.8.0-109362",
  "org.scalablytyped" %%% "web3-eth-iban" % "1.8.0-09d50c",
  "org.scalablytyped" %%% "web3-eth-personal" % "1.8.0-2bb5f5",
  "org.scalablytyped" %%% "web3-net" % "1.8.0-a920cc",
  "org.scalablytyped" %%% "web3-utils" % "1.8.0-2e2ee4")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
