organization := "org.scalablytyped"
name := "web3"
version := "1.2.4-7cff19"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bignumber_dot_js" % "9.0.0-fac0bc",
  "org.scalablytyped" %%% "bn_dot_js" % "4.11-dt-20190328Z-068208",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191119Z-94c257",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf",
  "org.scalablytyped" %%% "web3-bzz" % "1.2.4-e442c0",
  "org.scalablytyped" %%% "web3-core" % "1.2.4-c8aab9",
  "org.scalablytyped" %%% "web3-core-helpers" % "1.2.4-1a2084",
  "org.scalablytyped" %%% "web3-core-method" % "1.2.4-21b46f",
  "org.scalablytyped" %%% "web3-core-subscriptions" % "1.2.4-b0b24c",
  "org.scalablytyped" %%% "web3-eth" % "1.2.4-7c5ee7",
  "org.scalablytyped" %%% "web3-eth-abi" % "1.2.4-d5d61a",
  "org.scalablytyped" %%% "web3-eth-accounts" % "1.2.4-d000f1",
  "org.scalablytyped" %%% "web3-eth-contract" % "1.2.4-f2092c",
  "org.scalablytyped" %%% "web3-eth-ens" % "1.2.4-04f889",
  "org.scalablytyped" %%% "web3-eth-iban" % "1.2.4-fc712e",
  "org.scalablytyped" %%% "web3-eth-personal" % "1.2.4-378f5d",
  "org.scalablytyped" %%% "web3-net" % "1.2.4-9907a0",
  "org.scalablytyped" %%% "web3-shh" % "1.2.4-191a00",
  "org.scalablytyped" %%% "web3-utils" % "1.2.4-f51117")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        