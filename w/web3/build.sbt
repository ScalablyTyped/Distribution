organization := "org.scalablytyped"
name := "web3"
version := "1.2.4-d339cc"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bignumber_dot_js" % "9.0.0-fac0bc",
  "org.scalablytyped" %%% "bn_dot_js" % "4.11-dt-20190328Z-c33909",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191115Z-3b62fb",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf",
  "org.scalablytyped" %%% "web3-bzz" % "1.2.4-e442c0",
  "org.scalablytyped" %%% "web3-core" % "1.2.4-018391",
  "org.scalablytyped" %%% "web3-core-helpers" % "1.2.4-8952ae",
  "org.scalablytyped" %%% "web3-core-method" % "1.2.4-21b46f",
  "org.scalablytyped" %%% "web3-core-subscriptions" % "1.2.4-b0b24c",
  "org.scalablytyped" %%% "web3-eth" % "1.2.4-fb7529",
  "org.scalablytyped" %%% "web3-eth-abi" % "1.2.4-4a4530",
  "org.scalablytyped" %%% "web3-eth-accounts" % "1.2.4-22932c",
  "org.scalablytyped" %%% "web3-eth-contract" % "1.2.4-cf266d",
  "org.scalablytyped" %%% "web3-eth-ens" % "1.2.4-8baad2",
  "org.scalablytyped" %%% "web3-eth-iban" % "1.2.4-fc712e",
  "org.scalablytyped" %%% "web3-eth-personal" % "1.2.4-da6a1a",
  "org.scalablytyped" %%% "web3-net" % "1.2.4-63ec6b",
  "org.scalablytyped" %%% "web3-shh" % "1.2.4-49fc8f",
  "org.scalablytyped" %%% "web3-utils" % "1.2.4-25f03e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        