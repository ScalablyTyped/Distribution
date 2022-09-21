organization := "org.scalablytyped"
name := "web3-eth-accounts"
version := "1.8.0-0d7160"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bignumber_dot_js" % "9.1.0-1e7286",
  "org.scalablytyped" %%% "bn_dot_js" % "5.1-dt-20220829Z-bda688",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220913Z-77cc8d",
  "org.scalablytyped" %%% "std" % "4.8-958c79",
  "org.scalablytyped" %%% "web3-core" % "1.8.0-7e8c1d",
  "org.scalablytyped" %%% "web3-core-helpers" % "1.8.0-73808a",
  "org.scalablytyped" %%% "web3-core-method" % "1.8.0-1b55dc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
