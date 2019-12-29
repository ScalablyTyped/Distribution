organization := "org.scalablytyped"
name := "web3-eth"
version := "1.2.4-406986"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bignumber_dot_js" % "9.0.0-04e576",
  "org.scalablytyped" %%% "bn_dot_js" % "4.11-dt-20190328Z-38e30a",
  "org.scalablytyped" %%% "node" % "13.1-dt-20191226Z-155d58",
  "org.scalablytyped" %%% "std" % "3.7-953338",
  "org.scalablytyped" %%% "web3-core" % "1.2.4-4e1eeb",
  "org.scalablytyped" %%% "web3-core-helpers" % "1.2.4-8192e4",
  "org.scalablytyped" %%% "web3-core-method" % "1.2.4-f56b7f",
  "org.scalablytyped" %%% "web3-core-subscriptions" % "1.2.4-5cfa1e",
  "org.scalablytyped" %%% "web3-eth-abi" % "1.2.4-d7dd5c",
  "org.scalablytyped" %%% "web3-eth-accounts" % "1.2.4-0614f5",
  "org.scalablytyped" %%% "web3-eth-contract" % "1.2.4-f144ee",
  "org.scalablytyped" %%% "web3-eth-ens" % "1.2.4-df003e",
  "org.scalablytyped" %%% "web3-eth-iban" % "1.2.4-bc85b8",
  "org.scalablytyped" %%% "web3-eth-personal" % "1.2.4-244c66",
  "org.scalablytyped" %%% "web3-net" % "1.2.4-0216fc",
  "org.scalablytyped" %%% "web3-utils" % "1.2.4-77c0d5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        