organization := "org.scalablytyped"
name := "web3-net"
version := "1.3.0-ecdcf0"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "bignumber_dot_js" % "9.0.1-62be8e",
  "org.scalablytyped" %%% "bn_dot_js" % "4.11-dt-20200515Z-c652d8",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-50d3d9",
  "org.scalablytyped" %%% "std" % "4.1-40053c",
  "org.scalablytyped" %%% "web3-core" % "1.3.0-28d66c",
  "org.scalablytyped" %%% "web3-core-helpers" % "1.3.0-534a0b",
  "org.scalablytyped" %%% "web3-core-method" % "1.3.0-ab8cc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
