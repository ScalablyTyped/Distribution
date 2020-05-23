organization := "org.scalablytyped"
name := "web3-eth-contract"
version := "1.2.8-c8292b"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bignumber_dot_js" % "9.0.0-66109b",
  "org.scalablytyped" %%% "bn_dot_js" % "4.11-dt-20200515Z-3088dc",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200521Z-3aabb7",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb",
  "org.scalablytyped" %%% "web3-core" % "1.2.8-5668e3",
  "org.scalablytyped" %%% "web3-core-helpers" % "1.2.8-5d3119",
  "org.scalablytyped" %%% "web3-core-method" % "1.2.8-148de2",
  "org.scalablytyped" %%% "web3-utils" % "1.2.8-a22edc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
