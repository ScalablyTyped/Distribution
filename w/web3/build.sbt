organization := "org.scalablytyped"
name := "web3"
version := "1.2.6-92235b"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bn_dot_js" % "4.11-dt-20200103Z-d0b96c",
  "org.scalablytyped" %%% "node" % "13.7-dt-20200211Z-d6af7e",
  "org.scalablytyped" %%% "std" % "3.7-1b8369",
  "org.scalablytyped" %%% "web3-bzz" % "1.2.6-bb6dde",
  "org.scalablytyped" %%% "web3-core" % "1.2.6-20dc54",
  "org.scalablytyped" %%% "web3-core-helpers" % "1.2.6-dba239",
  "org.scalablytyped" %%% "web3-core-method" % "1.2.6-375e9a",
  "org.scalablytyped" %%% "web3-core-subscriptions" % "1.2.6-9791b3",
  "org.scalablytyped" %%% "web3-eth" % "1.2.6-b8464d",
  "org.scalablytyped" %%% "web3-eth-abi" % "1.2.6-f55cec",
  "org.scalablytyped" %%% "web3-eth-accounts" % "1.2.6-b4de99",
  "org.scalablytyped" %%% "web3-eth-contract" % "1.2.6-36197c",
  "org.scalablytyped" %%% "web3-eth-ens" % "1.2.6-16cfb4",
  "org.scalablytyped" %%% "web3-eth-iban" % "1.2.6-c211a5",
  "org.scalablytyped" %%% "web3-eth-personal" % "1.2.6-3379c1",
  "org.scalablytyped" %%% "web3-net" % "1.2.6-4d7418",
  "org.scalablytyped" %%% "web3-shh" % "1.2.6-6488c9",
  "org.scalablytyped" %%% "web3-utils" % "1.2.6-8edfb5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
