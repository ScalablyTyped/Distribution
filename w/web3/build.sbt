organization := "org.scalablytyped"
name := "web3"
version := "1.8.0-21b7dc"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bignumber_dot_js" % "9.1.0-08f9c6",
  "org.scalablytyped" %%% "bn_dot_js" % "5.1-dt-20220829Z-4a7dd1",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221024Z-2be228",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "web3-bzz" % "1.8.0-b8b9c8",
  "org.scalablytyped" %%% "web3-core" % "1.8.0-6b5877",
  "org.scalablytyped" %%% "web3-core-helpers" % "1.8.0-a8ced3",
  "org.scalablytyped" %%% "web3-core-method" % "1.8.0-05697e",
  "org.scalablytyped" %%% "web3-core-subscriptions" % "1.8.0-e7f17e",
  "org.scalablytyped" %%% "web3-eth" % "1.8.0-00de89",
  "org.scalablytyped" %%% "web3-eth-abi" % "1.8.0-f4d7ca",
  "org.scalablytyped" %%% "web3-eth-accounts" % "1.8.0-fbe87d",
  "org.scalablytyped" %%% "web3-eth-contract" % "1.8.0-ea8691",
  "org.scalablytyped" %%% "web3-eth-ens" % "1.8.0-0b9b89",
  "org.scalablytyped" %%% "web3-eth-iban" % "1.8.0-428945",
  "org.scalablytyped" %%% "web3-eth-personal" % "1.8.0-f087cd",
  "org.scalablytyped" %%% "web3-net" % "1.8.0-fe2e52",
  "org.scalablytyped" %%% "web3-shh" % "1.8.0-da3361",
  "org.scalablytyped" %%% "web3-utils" % "1.8.0-a019fd")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
