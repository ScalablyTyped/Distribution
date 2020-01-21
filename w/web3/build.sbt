organization := "org.scalablytyped"
name := "web3"
version := "1.2.4-89ecd3"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bignumber_dot_js" % "9.0.0-40c2bf",
  "org.scalablytyped" %%% "bn_dot_js" % "4.11-dt-20200103Z-226d8a",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200117Z-4be21b",
  "org.scalablytyped" %%% "std" % "3.7-96076c",
  "org.scalablytyped" %%% "web3-bzz" % "1.2.4-a253b8",
  "org.scalablytyped" %%% "web3-core" % "1.2.4-141f01",
  "org.scalablytyped" %%% "web3-core-helpers" % "1.2.4-28db6e",
  "org.scalablytyped" %%% "web3-core-method" % "1.2.4-857a54",
  "org.scalablytyped" %%% "web3-core-subscriptions" % "1.2.4-2b8db2",
  "org.scalablytyped" %%% "web3-eth" % "1.2.4-b489f2",
  "org.scalablytyped" %%% "web3-eth-abi" % "1.2.4-a68ad8",
  "org.scalablytyped" %%% "web3-eth-accounts" % "1.2.4-b71d80",
  "org.scalablytyped" %%% "web3-eth-contract" % "1.2.4-39ae79",
  "org.scalablytyped" %%% "web3-eth-ens" % "1.2.4-8ed580",
  "org.scalablytyped" %%% "web3-eth-iban" % "1.2.4-55a5f3",
  "org.scalablytyped" %%% "web3-eth-personal" % "1.2.4-f816b9",
  "org.scalablytyped" %%% "web3-net" % "1.2.4-121160",
  "org.scalablytyped" %%% "web3-shh" % "1.2.4-39522a",
  "org.scalablytyped" %%% "web3-utils" % "1.2.4-a88cb7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        