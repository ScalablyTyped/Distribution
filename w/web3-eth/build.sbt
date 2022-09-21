organization := "org.scalablytyped"
name := "web3-eth"
version := "1.8.0-e43a71"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bignumber_dot_js" % "9.1.0-1e7286",
  "org.scalablytyped" %%% "bn_dot_js" % "5.1-dt-20220829Z-bda688",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220913Z-77cc8d",
  "org.scalablytyped" %%% "std" % "4.8-958c79",
  "org.scalablytyped" %%% "web3-core" % "1.8.0-7e8c1d",
  "org.scalablytyped" %%% "web3-core-helpers" % "1.8.0-73808a",
  "org.scalablytyped" %%% "web3-core-method" % "1.8.0-1b55dc",
  "org.scalablytyped" %%% "web3-core-subscriptions" % "1.8.0-de69c7",
  "org.scalablytyped" %%% "web3-eth-abi" % "1.8.0-c6c629",
  "org.scalablytyped" %%% "web3-eth-accounts" % "1.8.0-0d7160",
  "org.scalablytyped" %%% "web3-eth-contract" % "1.8.0-cbe25f",
  "org.scalablytyped" %%% "web3-eth-ens" % "1.8.0-a4f9e2",
  "org.scalablytyped" %%% "web3-eth-iban" % "1.8.0-09d50c",
  "org.scalablytyped" %%% "web3-eth-personal" % "1.8.0-24575d",
  "org.scalablytyped" %%% "web3-net" % "1.8.0-98e987",
  "org.scalablytyped" %%% "web3-utils" % "1.8.0-618e51")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
