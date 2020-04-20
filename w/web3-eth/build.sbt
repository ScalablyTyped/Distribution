organization := "org.scalablytyped"
name := "web3-eth"
version := "1.2.6-200c7f"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bn_dot_js" % "4.11-dt-20200225Z-acfd77",
  "org.scalablytyped" %%% "node" % "13.13-dt-20200417Z-f3d81d",
  "org.scalablytyped" %%% "std" % "3.8-9b2470",
  "org.scalablytyped" %%% "web3-core" % "1.2.6-e81109",
  "org.scalablytyped" %%% "web3-core-helpers" % "1.2.6-77418e",
  "org.scalablytyped" %%% "web3-core-method" % "1.2.6-adc4c5",
  "org.scalablytyped" %%% "web3-core-subscriptions" % "1.2.6-96be39",
  "org.scalablytyped" %%% "web3-eth-abi" % "1.2.6-af96f1",
  "org.scalablytyped" %%% "web3-eth-accounts" % "1.2.6-ad2dd1",
  "org.scalablytyped" %%% "web3-eth-contract" % "1.2.6-93df3f",
  "org.scalablytyped" %%% "web3-eth-ens" % "1.2.6-7cbbbe",
  "org.scalablytyped" %%% "web3-eth-iban" % "1.2.6-1ab4c9",
  "org.scalablytyped" %%% "web3-eth-personal" % "1.2.6-bc8e5e",
  "org.scalablytyped" %%% "web3-net" % "1.2.6-fb40b8",
  "org.scalablytyped" %%% "web3-utils" % "1.2.6-ef9c8e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
