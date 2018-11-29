organization := "com.scalablytyped"
name := "web3-provider-engine"
version := "14.0-dt-20180910Z-02fbfc"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "bignumber_dot_js" % "8.0.1-2bc2ef",
  "com.scalablytyped" %%% "ethereum-protocol" % "1.0-dt-20180910Z-b6ed8d",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        