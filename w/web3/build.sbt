organization := "org.scalablytyped"
name := "web3"
version := "1.2.2-bd8153"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bn_dot_js" % "4.11-dt-20190328Z-227146",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191108Z-6cbaae",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf",
  "org.scalablytyped" %%% "web3-bzz" % "1.2.2-9c4742",
  "org.scalablytyped" %%% "web3-core" % "1.2.2-0ddd41",
  "org.scalablytyped" %%% "web3-core-helpers" % "1.2.2-e7d0e2",
  "org.scalablytyped" %%% "web3-core-method" % "1.2.2-58ce73",
  "org.scalablytyped" %%% "web3-core-subscriptions" % "1.2.2-bf1389",
  "org.scalablytyped" %%% "web3-eth" % "1.2.2-f3f510",
  "org.scalablytyped" %%% "web3-eth-abi" % "1.2.2-06cd8c",
  "org.scalablytyped" %%% "web3-eth-accounts" % "1.2.2-012038",
  "org.scalablytyped" %%% "web3-eth-contract" % "1.2.2-0a2595",
  "org.scalablytyped" %%% "web3-eth-ens" % "1.2.2-322f1d",
  "org.scalablytyped" %%% "web3-eth-iban" % "1.2.2-cb4ca5",
  "org.scalablytyped" %%% "web3-eth-personal" % "1.2.2-14243b",
  "org.scalablytyped" %%% "web3-net" % "1.2.2-58c46c",
  "org.scalablytyped" %%% "web3-shh" % "1.2.2-197c26",
  "org.scalablytyped" %%% "web3-utils" % "1.2.2-862267")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        