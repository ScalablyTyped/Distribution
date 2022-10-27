organization := "org.scalablytyped"
name := "web3-eth"
version := "1.8.0-f3f17a"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bignumber_dot_js" % "9.1.0-08f9c6",
  "org.scalablytyped" %%% "bn_dot_js" % "5.1-dt-20220829Z-ff2541",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221026Z-107efe",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "web3-core" % "1.8.0-7badce",
  "org.scalablytyped" %%% "web3-core-helpers" % "1.8.0-723ec6",
  "org.scalablytyped" %%% "web3-core-method" % "1.8.0-05697e",
  "org.scalablytyped" %%% "web3-core-subscriptions" % "1.8.0-e7f17e",
  "org.scalablytyped" %%% "web3-eth-abi" % "1.8.0-969462",
  "org.scalablytyped" %%% "web3-eth-accounts" % "1.8.0-e42345",
  "org.scalablytyped" %%% "web3-eth-contract" % "1.8.0-a59834",
  "org.scalablytyped" %%% "web3-eth-ens" % "1.8.0-c2777c",
  "org.scalablytyped" %%% "web3-eth-iban" % "1.8.0-428945",
  "org.scalablytyped" %%% "web3-eth-personal" % "1.8.0-be91eb",
  "org.scalablytyped" %%% "web3-net" % "1.8.0-10ca72",
  "org.scalablytyped" %%% "web3-utils" % "1.8.0-1781e5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
