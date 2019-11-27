organization := "org.scalablytyped"
name := "web3"
version := "1.2.4-6ef96e"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bignumber_dot_js" % "9.0.0-749a58",
  "org.scalablytyped" %%% "bn_dot_js" % "4.11-dt-20190328Z-588a9a",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191126Z-08e889",
  "org.scalablytyped" %%% "std" % "3.7-1d724d",
  "org.scalablytyped" %%% "web3-bzz" % "1.2.4-ad0482",
  "org.scalablytyped" %%% "web3-core" % "1.2.4-405a91",
  "org.scalablytyped" %%% "web3-core-helpers" % "1.2.4-dace22",
  "org.scalablytyped" %%% "web3-core-method" % "1.2.4-78bb12",
  "org.scalablytyped" %%% "web3-core-subscriptions" % "1.2.4-089a06",
  "org.scalablytyped" %%% "web3-eth" % "1.2.4-e00408",
  "org.scalablytyped" %%% "web3-eth-abi" % "1.2.4-366ca2",
  "org.scalablytyped" %%% "web3-eth-accounts" % "1.2.4-ff6d42",
  "org.scalablytyped" %%% "web3-eth-contract" % "1.2.4-49925f",
  "org.scalablytyped" %%% "web3-eth-ens" % "1.2.4-6befe5",
  "org.scalablytyped" %%% "web3-eth-iban" % "1.2.4-bc85b8",
  "org.scalablytyped" %%% "web3-eth-personal" % "1.2.4-95909a",
  "org.scalablytyped" %%% "web3-net" % "1.2.4-a13016",
  "org.scalablytyped" %%% "web3-shh" % "1.2.4-da1ad6",
  "org.scalablytyped" %%% "web3-utils" % "1.2.4-79c71e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        