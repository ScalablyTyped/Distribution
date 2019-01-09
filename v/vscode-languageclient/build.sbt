organization := "org.scalablytyped"
name := "vscode-languageclient"
version := "5.2.1-2ea55c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2aa425",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-9e6585",
  "org.scalablytyped" %%% "std" % "3.2.2-f3cc98",
  "org.scalablytyped" %%% "vscode-jsonrpc" % "4.0.0-4778d6",
  "org.scalablytyped" %%% "vscode-languageserver-protocol" % "3.14.1-005ff0",
  "org.scalablytyped" %%% "vscode-languageserver-types" % "3.14.0-b2576a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        