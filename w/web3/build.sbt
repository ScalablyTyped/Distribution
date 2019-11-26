organization := "org.scalablytyped"
name := "web3"
version := "1.2.4-d36d74"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bignumber_dot_js" % "9.0.0-749a58",
  "org.scalablytyped" %%% "bn_dot_js" % "4.11-dt-20190328Z-17571b",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191125Z-959704",
  "org.scalablytyped" %%% "std" % "3.7-1d724d",
  "org.scalablytyped" %%% "web3-bzz" % "1.2.4-ad0482",
  "org.scalablytyped" %%% "web3-core" % "1.2.4-de87ed",
  "org.scalablytyped" %%% "web3-core-helpers" % "1.2.4-0e167b",
  "org.scalablytyped" %%% "web3-core-method" % "1.2.4-78bb12",
  "org.scalablytyped" %%% "web3-core-subscriptions" % "1.2.4-089a06",
  "org.scalablytyped" %%% "web3-eth" % "1.2.4-dfd2fb",
  "org.scalablytyped" %%% "web3-eth-abi" % "1.2.4-c772c2",
  "org.scalablytyped" %%% "web3-eth-accounts" % "1.2.4-f6e5d6",
  "org.scalablytyped" %%% "web3-eth-contract" % "1.2.4-a461c0",
  "org.scalablytyped" %%% "web3-eth-ens" % "1.2.4-f1d310",
  "org.scalablytyped" %%% "web3-eth-iban" % "1.2.4-bc85b8",
  "org.scalablytyped" %%% "web3-eth-personal" % "1.2.4-494662",
  "org.scalablytyped" %%% "web3-net" % "1.2.4-02a0e0",
  "org.scalablytyped" %%% "web3-shh" % "1.2.4-f2ddee",
  "org.scalablytyped" %%% "web3-utils" % "1.2.4-f1863f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        