organization := "org.scalablytyped"
name := "web3"
version := "1.8.0-56df5f"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bignumber_dot_js" % "9.1.0-251330",
  "org.scalablytyped" %%% "bn_dot_js" % "5.1-dt-20220829Z-6fd3d1",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221018Z-1e532a",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "web3-bzz" % "1.8.0-9f24ed",
  "org.scalablytyped" %%% "web3-core" % "1.8.0-2f630d",
  "org.scalablytyped" %%% "web3-core-helpers" % "1.8.0-0922e5",
  "org.scalablytyped" %%% "web3-core-method" % "1.8.0-8237f3",
  "org.scalablytyped" %%% "web3-core-subscriptions" % "1.8.0-54a30c",
  "org.scalablytyped" %%% "web3-eth" % "1.8.0-97d1bd",
  "org.scalablytyped" %%% "web3-eth-abi" % "1.8.0-9bd843",
  "org.scalablytyped" %%% "web3-eth-accounts" % "1.8.0-f849c4",
  "org.scalablytyped" %%% "web3-eth-contract" % "1.8.0-4e3a00",
  "org.scalablytyped" %%% "web3-eth-ens" % "1.8.0-e9fb4b",
  "org.scalablytyped" %%% "web3-eth-iban" % "1.8.0-09d50c",
  "org.scalablytyped" %%% "web3-eth-personal" % "1.8.0-35b01d",
  "org.scalablytyped" %%% "web3-net" % "1.8.0-86ca1c",
  "org.scalablytyped" %%% "web3-shh" % "1.8.0-897860",
  "org.scalablytyped" %%% "web3-utils" % "1.8.0-1b5d9f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
