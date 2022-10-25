organization := "org.scalablytyped"
name := "web3-core"
version := "1.8.0-6b5877"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bignumber_dot_js" % "9.1.0-08f9c6",
  "org.scalablytyped" %%% "bn_dot_js" % "5.1-dt-20220829Z-4a7dd1",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221024Z-2be228",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "web3-core-helpers" % "1.8.0-a8ced3",
  "org.scalablytyped" %%% "web3-core-method" % "1.8.0-05697e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
