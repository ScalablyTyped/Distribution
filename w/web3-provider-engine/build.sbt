organization := "org.scalablytyped"
name := "web3-provider-engine"
version := "14.0-dt-20180730Z-d9e8dc"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "bignumber_dot_js" % "8.1.1-630853",
  "org.scalablytyped" %%% "ethereum-protocol" % "1.0-dt-20180612Z-62abf6",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        