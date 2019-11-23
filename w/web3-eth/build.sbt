organization := "org.scalablytyped"
name := "web3-eth"
version := "1.2.4-8523e5"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bignumber_dot_js" % "9.0.0-fac0bc",
  "org.scalablytyped" %%% "bn_dot_js" % "4.11-dt-20190328Z-d1847c",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191123Z-304e79",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf",
  "org.scalablytyped" %%% "web3-core" % "1.2.4-4021f1",
  "org.scalablytyped" %%% "web3-core-helpers" % "1.2.4-14c5f1",
  "org.scalablytyped" %%% "web3-core-method" % "1.2.4-21b46f",
  "org.scalablytyped" %%% "web3-core-subscriptions" % "1.2.4-b0b24c",
  "org.scalablytyped" %%% "web3-eth-abi" % "1.2.4-8cdd82",
  "org.scalablytyped" %%% "web3-eth-accounts" % "1.2.4-821ab3",
  "org.scalablytyped" %%% "web3-eth-contract" % "1.2.4-c399a2",
  "org.scalablytyped" %%% "web3-eth-ens" % "1.2.4-b2b8d1",
  "org.scalablytyped" %%% "web3-eth-iban" % "1.2.4-fc712e",
  "org.scalablytyped" %%% "web3-eth-personal" % "1.2.4-bf9f26",
  "org.scalablytyped" %%% "web3-net" % "1.2.4-5e33eb",
  "org.scalablytyped" %%% "web3-utils" % "1.2.4-e02e7f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        