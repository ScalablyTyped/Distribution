organization := "org.scalablytyped"
name := "web3"
version := "1.2.11-9e1766"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bignumber_dot_js" % "9.0.0-5d9dcc",
  "org.scalablytyped" %%% "bn_dot_js" % "4.11-dt-20200515Z-f930fa",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200724Z-6c1ba3",
  "org.scalablytyped" %%% "std" % "3.9-bafc13",
  "org.scalablytyped" %%% "web3-bzz" % "1.2.11-1b3e28",
  "org.scalablytyped" %%% "web3-core" % "1.2.11-adf9ee",
  "org.scalablytyped" %%% "web3-core-helpers" % "1.2.11-b90689",
  "org.scalablytyped" %%% "web3-core-method" % "1.2.11-74d537",
  "org.scalablytyped" %%% "web3-core-subscriptions" % "1.2.11-102001",
  "org.scalablytyped" %%% "web3-eth" % "1.2.11-20733f",
  "org.scalablytyped" %%% "web3-eth-abi" % "1.2.11-366f25",
  "org.scalablytyped" %%% "web3-eth-accounts" % "1.2.11-f04eda",
  "org.scalablytyped" %%% "web3-eth-contract" % "1.2.11-59cc14",
  "org.scalablytyped" %%% "web3-eth-ens" % "1.2.11-ccc448",
  "org.scalablytyped" %%% "web3-eth-iban" % "1.2.11-576f38",
  "org.scalablytyped" %%% "web3-eth-personal" % "1.2.11-516e22",
  "org.scalablytyped" %%% "web3-net" % "1.2.11-6d665e",
  "org.scalablytyped" %%% "web3-shh" % "1.2.11-4b7e83",
  "org.scalablytyped" %%% "web3-utils" % "1.2.11-fe87d8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
