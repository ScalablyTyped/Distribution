organization := "org.scalablytyped"
name := "web3"
version := "1.2.2-e91d0b"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bn_dot_js" % "4.11-dt-20190328Z-cefcac",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191030Z-4bf573",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a",
  "org.scalablytyped" %%% "web3-bzz" % "1.2.2-b6f4f0",
  "org.scalablytyped" %%% "web3-core" % "1.2.2-279dac",
  "org.scalablytyped" %%% "web3-core-helpers" % "1.2.2-8a35df",
  "org.scalablytyped" %%% "web3-core-method" % "1.2.2-e8b753",
  "org.scalablytyped" %%% "web3-core-subscriptions" % "1.2.2-f81d70",
  "org.scalablytyped" %%% "web3-eth" % "1.2.2-4c7668",
  "org.scalablytyped" %%% "web3-eth-accounts" % "1.2.2-5940c2",
  "org.scalablytyped" %%% "web3-eth-contract" % "1.2.2-c3538c",
  "org.scalablytyped" %%% "web3-eth-ens" % "1.2.2-cd460f",
  "org.scalablytyped" %%% "web3-eth-iban" % "1.2.2-cb4ca5",
  "org.scalablytyped" %%% "web3-eth-personal" % "1.2.2-ac74b8",
  "org.scalablytyped" %%% "web3-net" % "1.2.2-0ab507",
  "org.scalablytyped" %%% "web3-shh" % "1.2.2-100893",
  "org.scalablytyped" %%% "web3-utils" % "1.2.2-ebc7d1")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        