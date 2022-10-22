organization := "org.scalablytyped"
name := "web3-eth-accounts"
version := "1.8.0-83bc53"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bignumber_dot_js" % "9.1.0-251330",
  "org.scalablytyped" %%% "bn_dot_js" % "5.1-dt-20220829Z-a32a49",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221020Z-d73de4",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "web3-core" % "1.8.0-e29b5c",
  "org.scalablytyped" %%% "web3-core-helpers" % "1.8.0-05b959",
  "org.scalablytyped" %%% "web3-core-method" % "1.8.0-8237f3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
