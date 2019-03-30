organization := "org.scalablytyped"
name := "vscode-languageclient"
version := "5.2.1-4694dc"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "node" % "11.12-dt-20190330Z-e2b8de",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-6adbd7",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "vscode" % "1.32-dt-20190325Z-9a60e6",
  "org.scalablytyped" %%% "vscode-jsonrpc" % "4.0.0-3f8b11",
  "org.scalablytyped" %%% "vscode-languageserver-protocol" % "3.14.1-8852e8",
  "org.scalablytyped" %%% "vscode-languageserver-types" % "3.14.0-3e2dc6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        