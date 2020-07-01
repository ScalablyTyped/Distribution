organization := "org.scalablytyped"
name := "web3-eth-ens"
version := "1.2.9-4f95bc"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bignumber_dot_js" % "9.0.0-e3953a",
  "org.scalablytyped" %%% "bn_dot_js" % "4.11-dt-20200515Z-89d698",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200624Z-2fcd45",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8",
  "org.scalablytyped" %%% "web3-core" % "1.2.9-95841e",
  "org.scalablytyped" %%% "web3-core-helpers" % "1.2.9-f5bf1c",
  "org.scalablytyped" %%% "web3-core-method" % "1.2.9-c6a635",
  "org.scalablytyped" %%% "web3-eth-contract" % "1.2.9-cdd4de",
  "org.scalablytyped" %%% "web3-utils" % "1.2.9-24d0a4")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
