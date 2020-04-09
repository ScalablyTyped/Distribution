organization := "org.scalablytyped"
name := "web3"
version := "1.2.6-b911b8"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bn_dot_js" % "4.11-dt-20200225Z-9ae711",
  "org.scalablytyped" %%% "node" % "13.11-dt-20200402Z-9a87f0",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "web3-bzz" % "1.2.6-41f7ca",
  "org.scalablytyped" %%% "web3-core" % "1.2.6-b4d32f",
  "org.scalablytyped" %%% "web3-core-helpers" % "1.2.6-056631",
  "org.scalablytyped" %%% "web3-core-method" % "1.2.6-3b9221",
  "org.scalablytyped" %%% "web3-core-subscriptions" % "1.2.6-adb452",
  "org.scalablytyped" %%% "web3-eth" % "1.2.6-c52ef2",
  "org.scalablytyped" %%% "web3-eth-abi" % "1.2.6-fc0590",
  "org.scalablytyped" %%% "web3-eth-accounts" % "1.2.6-79d336",
  "org.scalablytyped" %%% "web3-eth-contract" % "1.2.6-7dd303",
  "org.scalablytyped" %%% "web3-eth-ens" % "1.2.6-05b248",
  "org.scalablytyped" %%% "web3-eth-iban" % "1.2.6-c211a5",
  "org.scalablytyped" %%% "web3-eth-personal" % "1.2.6-c5b708",
  "org.scalablytyped" %%% "web3-net" % "1.2.6-42a92d",
  "org.scalablytyped" %%% "web3-shh" % "1.2.6-5f3037",
  "org.scalablytyped" %%% "web3-utils" % "1.2.6-35ce24")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
