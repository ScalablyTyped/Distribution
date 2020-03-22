organization := "org.scalablytyped"
name := "web3"
version := "1.2.6-608bcd"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bn_dot_js" % "4.11-dt-20200103Z-e67138",
  "org.scalablytyped" %%% "node" % "13.7-dt-20200211Z-b30bde",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "web3-bzz" % "1.2.6-41f7ca",
  "org.scalablytyped" %%% "web3-core" % "1.2.6-f71e2e",
  "org.scalablytyped" %%% "web3-core-helpers" % "1.2.6-3bcd77",
  "org.scalablytyped" %%% "web3-core-method" % "1.2.6-3b9221",
  "org.scalablytyped" %%% "web3-core-subscriptions" % "1.2.6-adb452",
  "org.scalablytyped" %%% "web3-eth" % "1.2.6-5d4334",
  "org.scalablytyped" %%% "web3-eth-abi" % "1.2.6-e6640b",
  "org.scalablytyped" %%% "web3-eth-accounts" % "1.2.6-022c75",
  "org.scalablytyped" %%% "web3-eth-contract" % "1.2.6-65c645",
  "org.scalablytyped" %%% "web3-eth-ens" % "1.2.6-d53bc6",
  "org.scalablytyped" %%% "web3-eth-iban" % "1.2.6-c211a5",
  "org.scalablytyped" %%% "web3-eth-personal" % "1.2.6-7eaab8",
  "org.scalablytyped" %%% "web3-net" % "1.2.6-47f5e1",
  "org.scalablytyped" %%% "web3-shh" % "1.2.6-b69dd9",
  "org.scalablytyped" %%% "web3-utils" % "1.2.6-9a7fe2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
