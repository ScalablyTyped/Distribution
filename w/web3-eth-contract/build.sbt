organization := "org.scalablytyped"
name := "web3-eth-contract"
version := "1.8.0-9bcc3c"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bignumber_dot_js" % "9.1.0-8a3bed",
  "org.scalablytyped" %%% "bn_dot_js" % "5.1-dt-20220829Z-f88b99",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220926Z-d201ab",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb",
  "org.scalablytyped" %%% "web3-core" % "1.8.0-216461",
  "org.scalablytyped" %%% "web3-core-helpers" % "1.8.0-6b39d6",
  "org.scalablytyped" %%% "web3-core-method" % "1.8.0-a71cb3",
  "org.scalablytyped" %%% "web3-eth-accounts" % "1.8.0-7e6ab6",
  "org.scalablytyped" %%% "web3-utils" % "1.8.0-b1b01a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
