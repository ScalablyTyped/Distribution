organization := "org.scalablytyped"
name := "web3-eth-accounts"
version := "1.3.0-34390a"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bignumber_dot_js" % "9.0.1-b04fb0",
  "org.scalablytyped" %%% "bn_dot_js" % "4.11-dt-20200515Z-a08c0a",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-ad1aba",
  "org.scalablytyped" %%% "std" % "4.1-c651d0",
  "org.scalablytyped" %%% "web3-core" % "1.3.0-733747",
  "org.scalablytyped" %%% "web3-core-helpers" % "1.3.0-8b336b",
  "org.scalablytyped" %%% "web3-core-method" % "1.3.0-3e0c20")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
