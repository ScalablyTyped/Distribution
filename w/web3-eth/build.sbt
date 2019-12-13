organization := "org.scalablytyped"
name := "web3-eth"
version := "1.2.4-545991"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bignumber_dot_js" % "9.0.0-749a58",
  "org.scalablytyped" %%% "bn_dot_js" % "4.11-dt-20190328Z-2d3dec",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191210Z-b5c359",
  "org.scalablytyped" %%% "std" % "3.7-1d724d",
  "org.scalablytyped" %%% "web3-core" % "1.2.4-fc8eae",
  "org.scalablytyped" %%% "web3-core-helpers" % "1.2.4-8658ac",
  "org.scalablytyped" %%% "web3-core-method" % "1.2.4-78bb12",
  "org.scalablytyped" %%% "web3-core-subscriptions" % "1.2.4-089a06",
  "org.scalablytyped" %%% "web3-eth-abi" % "1.2.4-def877",
  "org.scalablytyped" %%% "web3-eth-accounts" % "1.2.4-48829c",
  "org.scalablytyped" %%% "web3-eth-contract" % "1.2.4-4afbc7",
  "org.scalablytyped" %%% "web3-eth-ens" % "1.2.4-2877e5",
  "org.scalablytyped" %%% "web3-eth-iban" % "1.2.4-bc85b8",
  "org.scalablytyped" %%% "web3-eth-personal" % "1.2.4-99ea24",
  "org.scalablytyped" %%% "web3-net" % "1.2.4-f8912e",
  "org.scalablytyped" %%% "web3-utils" % "1.2.4-5a884a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        