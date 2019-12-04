organization := "org.scalablytyped"
name := "web3-eth-accounts"
version := "1.2.4-db3274"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bignumber_dot_js" % "9.0.0-749a58",
  "org.scalablytyped" %%% "bn_dot_js" % "4.11-dt-20190328Z-c67a8c",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191126Z-959704",
  "org.scalablytyped" %%% "std" % "3.7-1d724d",
  "org.scalablytyped" %%% "web3-core" % "1.2.4-697131",
  "org.scalablytyped" %%% "web3-core-helpers" % "1.2.4-5ddc6d",
  "org.scalablytyped" %%% "web3-core-method" % "1.2.4-78bb12")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        