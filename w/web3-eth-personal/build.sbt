organization := "org.scalablytyped"
name := "web3-eth-personal"
version := "1.2.4-f816b9"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bignumber_dot_js" % "9.0.0-40c2bf",
  "org.scalablytyped" %%% "bn_dot_js" % "4.11-dt-20200103Z-226d8a",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200117Z-4be21b",
  "org.scalablytyped" %%% "std" % "3.7-96076c",
  "org.scalablytyped" %%% "web3-core" % "1.2.4-141f01",
  "org.scalablytyped" %%% "web3-core-helpers" % "1.2.4-28db6e",
  "org.scalablytyped" %%% "web3-core-method" % "1.2.4-857a54")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        