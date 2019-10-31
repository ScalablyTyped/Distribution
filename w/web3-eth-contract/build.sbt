organization := "org.scalablytyped"
name := "web3-eth-contract"
version := "1.2.2-c3538c"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bn_dot_js" % "4.11-dt-20190328Z-cefcac",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191030Z-4bf573",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a",
  "org.scalablytyped" %%% "web3-core" % "1.2.2-279dac",
  "org.scalablytyped" %%% "web3-core-helpers" % "1.2.2-8a35df",
  "org.scalablytyped" %%% "web3-core-method" % "1.2.2-e8b753",
  "org.scalablytyped" %%% "web3-utils" % "1.2.2-ebc7d1")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        