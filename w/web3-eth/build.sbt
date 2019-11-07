organization := "org.scalablytyped"
name := "web3-eth"
version := "1.2.2-9c0e3c"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bn_dot_js" % "4.11-dt-20190328Z-3c9a9a",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191105Z-2397f3",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf",
  "org.scalablytyped" %%% "web3-core" % "1.2.2-9dc84d",
  "org.scalablytyped" %%% "web3-core-helpers" % "1.2.2-3b0399",
  "org.scalablytyped" %%% "web3-core-method" % "1.2.2-58ce73",
  "org.scalablytyped" %%% "web3-core-subscriptions" % "1.2.2-bf1389",
  "org.scalablytyped" %%% "web3-eth-accounts" % "1.2.2-cc86d2",
  "org.scalablytyped" %%% "web3-eth-contract" % "1.2.2-b203f7",
  "org.scalablytyped" %%% "web3-eth-ens" % "1.2.2-3c71fa",
  "org.scalablytyped" %%% "web3-eth-iban" % "1.2.2-cb4ca5",
  "org.scalablytyped" %%% "web3-eth-personal" % "1.2.2-eb23a3",
  "org.scalablytyped" %%% "web3-net" % "1.2.2-3da2b9",
  "org.scalablytyped" %%% "web3-utils" % "1.2.2-05effa")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        