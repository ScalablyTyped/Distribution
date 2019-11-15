organization := "org.scalablytyped"
name := "web3-eth-ens"
version := "1.2.3-23d9ad"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bignumber_dot_js" % "9.0.0-fac0bc",
  "org.scalablytyped" %%% "bn_dot_js" % "4.11-dt-20190328Z-227146",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191108Z-6cbaae",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf",
  "org.scalablytyped" %%% "web3-core" % "1.2.3-57b99f",
  "org.scalablytyped" %%% "web3-core-helpers" % "1.2.3-49a95b",
  "org.scalablytyped" %%% "web3-core-method" % "1.2.3-4dfc50",
  "org.scalablytyped" %%% "web3-eth-contract" % "1.2.3-d29749",
  "org.scalablytyped" %%% "web3-utils" % "1.2.3-042396")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        