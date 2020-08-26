organization := "org.scalablytyped"
name := "web3-eth-accounts"
version := "1.2.11-f04eda"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bignumber_dot_js" % "9.0.0-5d9dcc",
  "org.scalablytyped" %%% "bn_dot_js" % "4.11-dt-20200515Z-f930fa",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200724Z-6c1ba3",
  "org.scalablytyped" %%% "std" % "3.9-bafc13",
  "org.scalablytyped" %%% "web3-core" % "1.2.11-adf9ee",
  "org.scalablytyped" %%% "web3-core-helpers" % "1.2.11-b90689",
  "org.scalablytyped" %%% "web3-core-method" % "1.2.11-74d537")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
