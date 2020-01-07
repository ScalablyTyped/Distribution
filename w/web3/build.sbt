organization := "org.scalablytyped"
name := "web3"
version := "1.2.4-e78d16"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bignumber_dot_js" % "9.0.0-626b5d",
  "org.scalablytyped" %%% "bn_dot_js" % "4.11-dt-20200103Z-03baf7",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200103Z-51871a",
  "org.scalablytyped" %%% "std" % "3.7-b6d959",
  "org.scalablytyped" %%% "web3-bzz" % "1.2.4-bbc2f5",
  "org.scalablytyped" %%% "web3-core" % "1.2.4-f8dbc3",
  "org.scalablytyped" %%% "web3-core-helpers" % "1.2.4-0a2bc8",
  "org.scalablytyped" %%% "web3-core-method" % "1.2.4-13238b",
  "org.scalablytyped" %%% "web3-core-subscriptions" % "1.2.4-72b4e6",
  "org.scalablytyped" %%% "web3-eth" % "1.2.4-0f1989",
  "org.scalablytyped" %%% "web3-eth-abi" % "1.2.4-fa390e",
  "org.scalablytyped" %%% "web3-eth-accounts" % "1.2.4-fabe7e",
  "org.scalablytyped" %%% "web3-eth-contract" % "1.2.4-57951e",
  "org.scalablytyped" %%% "web3-eth-ens" % "1.2.4-fdd08f",
  "org.scalablytyped" %%% "web3-eth-iban" % "1.2.4-bc85b8",
  "org.scalablytyped" %%% "web3-eth-personal" % "1.2.4-b799dc",
  "org.scalablytyped" %%% "web3-net" % "1.2.4-ad6b81",
  "org.scalablytyped" %%% "web3-shh" % "1.2.4-8d859b",
  "org.scalablytyped" %%% "web3-utils" % "1.2.4-dcaaa6")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        