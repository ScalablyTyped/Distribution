organization := "org.scalablytyped"
name := "web3-eth"
version := "1.8.0-b87709"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bignumber_dot_js" % "9.1.0-8a3bed",
  "org.scalablytyped" %%% "bn_dot_js" % "5.1-dt-20220829Z-f88b99",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220926Z-d201ab",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb",
  "org.scalablytyped" %%% "web3-core" % "1.8.0-216461",
  "org.scalablytyped" %%% "web3-core-helpers" % "1.8.0-6b39d6",
  "org.scalablytyped" %%% "web3-core-method" % "1.8.0-a71cb3",
  "org.scalablytyped" %%% "web3-core-subscriptions" % "1.8.0-79020b",
  "org.scalablytyped" %%% "web3-eth-abi" % "1.8.0-c18919",
  "org.scalablytyped" %%% "web3-eth-accounts" % "1.8.0-7e6ab6",
  "org.scalablytyped" %%% "web3-eth-contract" % "1.8.0-9bcc3c",
  "org.scalablytyped" %%% "web3-eth-ens" % "1.8.0-e3afd4",
  "org.scalablytyped" %%% "web3-eth-iban" % "1.8.0-09d50c",
  "org.scalablytyped" %%% "web3-eth-personal" % "1.8.0-6ccb0e",
  "org.scalablytyped" %%% "web3-net" % "1.8.0-4cd6d6",
  "org.scalablytyped" %%% "web3-utils" % "1.8.0-b1b01a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
