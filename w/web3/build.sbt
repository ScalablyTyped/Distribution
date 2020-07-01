organization := "org.scalablytyped"
name := "web3"
version := "1.2.9-c4ebac"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bignumber_dot_js" % "9.0.0-e3953a",
  "org.scalablytyped" %%% "bn_dot_js" % "4.11-dt-20200515Z-89d698",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200624Z-2fcd45",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8",
  "org.scalablytyped" %%% "web3-bzz" % "1.2.9-30a2e5",
  "org.scalablytyped" %%% "web3-core" % "1.2.9-95841e",
  "org.scalablytyped" %%% "web3-core-helpers" % "1.2.9-f5bf1c",
  "org.scalablytyped" %%% "web3-core-method" % "1.2.9-c6a635",
  "org.scalablytyped" %%% "web3-core-subscriptions" % "1.2.9-6886a5",
  "org.scalablytyped" %%% "web3-eth" % "1.2.9-e7ad19",
  "org.scalablytyped" %%% "web3-eth-abi" % "1.2.9-d044a5",
  "org.scalablytyped" %%% "web3-eth-accounts" % "1.2.9-bab44f",
  "org.scalablytyped" %%% "web3-eth-contract" % "1.2.9-cdd4de",
  "org.scalablytyped" %%% "web3-eth-ens" % "1.2.9-4f95bc",
  "org.scalablytyped" %%% "web3-eth-iban" % "1.2.9-e77dd8",
  "org.scalablytyped" %%% "web3-eth-personal" % "1.2.9-893a51",
  "org.scalablytyped" %%% "web3-net" % "1.2.9-e68daa",
  "org.scalablytyped" %%% "web3-shh" % "1.2.9-ae6d71",
  "org.scalablytyped" %%% "web3-utils" % "1.2.9-24d0a4")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
