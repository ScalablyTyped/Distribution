organization := "org.scalablytyped"
name := "web3-eth-accounts"
version := "1.3.0-f41465"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bignumber_dot_js" % "9.0.1-df05c6",
  "org.scalablytyped" %%% "bn_dot_js" % "4.11-dt-20200515Z-33054c",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-814aa8",
  "org.scalablytyped" %%% "std" % "4.1-044efb",
  "org.scalablytyped" %%% "web3-core" % "1.3.0-6aaa9f",
  "org.scalablytyped" %%% "web3-core-helpers" % "1.3.0-8d6686",
  "org.scalablytyped" %%% "web3-core-method" % "1.3.0-c7dda6")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
