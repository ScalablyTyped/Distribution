organization := "org.scalablytyped"
name := "vscode-languageclient"
version := "5.2.1-6c4733"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190325Z-000e7b",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-816092",
  "org.scalablytyped" %%% "std" % "3.3-14e863",
  "org.scalablytyped" %%% "vscode" % "1.32-dt-20190325Z-c70b14",
  "org.scalablytyped" %%% "vscode-jsonrpc" % "4.0.0-312717",
  "org.scalablytyped" %%% "vscode-languageserver-protocol" % "3.14.1-fefe2a",
  "org.scalablytyped" %%% "vscode-languageserver-types" % "3.14.0-666a59")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        