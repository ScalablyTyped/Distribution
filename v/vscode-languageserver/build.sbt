organization := "org.scalablytyped"
name := "vscode-languageserver"
version := "5.2.1-b8c6bf"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-e45326",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73",
  "org.scalablytyped" %%% "vscode-jsonrpc" % "4.0.0-ca9c93",
  "org.scalablytyped" %%% "vscode-languageserver-protocol" % "3.14.1-8f7df9",
  "org.scalablytyped" %%% "vscode-languageserver-types" % "3.14.0-894db8",
  "org.scalablytyped" %%% "vscode-uri" % "1.0.6-f1e6fb")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        