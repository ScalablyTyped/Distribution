organization := "org.scalablytyped"
name := "web3-net"
version := "1.2.4-9236bf"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bignumber_dot_js" % "9.0.0-626b5d",
  "org.scalablytyped" %%% "bn_dot_js" % "4.11-dt-20200103Z-55937c",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200115Z-14f523",
  "org.scalablytyped" %%% "std" % "3.7-b6d959",
  "org.scalablytyped" %%% "web3-core" % "1.2.4-b73740",
  "org.scalablytyped" %%% "web3-core-helpers" % "1.2.4-53e757",
  "org.scalablytyped" %%% "web3-core-method" % "1.2.4-13238b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        