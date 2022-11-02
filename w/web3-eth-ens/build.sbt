organization := "org.scalablytyped"
name := "web3-eth-ens"
version := "1.8.0-d9d8d9"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bignumber_dot_js" % "9.1.0-08f9c6",
  "org.scalablytyped" %%% "bn_dot_js" % "5.1-dt-20220829Z-509689",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-d0f137",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "web3-core" % "1.8.0-36e37c",
  "org.scalablytyped" %%% "web3-core-helpers" % "1.8.0-756c8a",
  "org.scalablytyped" %%% "web3-core-method" % "1.8.0-05697e",
  "org.scalablytyped" %%% "web3-eth-accounts" % "1.8.0-6dc8b7",
  "org.scalablytyped" %%% "web3-eth-contract" % "1.8.0-bf3f41",
  "org.scalablytyped" %%% "web3-utils" % "1.8.0-ee3507")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
