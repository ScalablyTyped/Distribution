organization := "org.scalablytyped"
name := "web3-eth"
version := "1.3.0-3d23f4"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bignumber_dot_js" % "9.0.1-b04fb0",
  "org.scalablytyped" %%% "bn_dot_js" % "4.11-dt-20200515Z-a08c0a",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-ad1aba",
  "org.scalablytyped" %%% "std" % "4.1-c651d0",
  "org.scalablytyped" %%% "web3-core" % "1.3.0-733747",
  "org.scalablytyped" %%% "web3-core-helpers" % "1.3.0-8b336b",
  "org.scalablytyped" %%% "web3-core-method" % "1.3.0-3e0c20",
  "org.scalablytyped" %%% "web3-core-subscriptions" % "1.3.0-aa8cf5",
  "org.scalablytyped" %%% "web3-eth-abi" % "1.3.0-9042c1",
  "org.scalablytyped" %%% "web3-eth-accounts" % "1.3.0-34390a",
  "org.scalablytyped" %%% "web3-eth-contract" % "1.3.0-536459",
  "org.scalablytyped" %%% "web3-eth-ens" % "1.3.0-bf3bc1",
  "org.scalablytyped" %%% "web3-eth-iban" % "1.3.0-eb4e87",
  "org.scalablytyped" %%% "web3-eth-personal" % "1.3.0-580831",
  "org.scalablytyped" %%% "web3-net" % "1.3.0-99f432",
  "org.scalablytyped" %%% "web3-utils" % "1.3.0-8663ec")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
