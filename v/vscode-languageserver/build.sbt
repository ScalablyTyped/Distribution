organization := "org.scalablytyped"
name := "vscode-languageserver"
version := "5.1.0-df5b5c"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-d9c01e",
  "org.scalablytyped" %%% "std" % "3.2.1-edfe2b",
  "org.scalablytyped" %%% "vscode-jsonrpc" % "4.0.0-9d446e",
  "org.scalablytyped" %%% "vscode-languageserver-protocol" % "3.13.0-f15b17",
  "org.scalablytyped" %%% "vscode-languageserver-types" % "3.13.0-bbd694",
  "org.scalablytyped" %%% "vscode-uri" % "1.0.6-d8ad2b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        