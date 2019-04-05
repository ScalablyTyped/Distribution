organization := "org.scalablytyped"
name := "vscode-languageclient"
version := "5.2.1-25f6aa"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190330Z-7c1cfd",
  "org.scalablytyped" %%% "semver" % "6.0-dt-20190330Z-1b8b1f",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "vscode" % "1.33-dt-20190404Z-08c12b",
  "org.scalablytyped" %%% "vscode-jsonrpc" % "4.0.0-7b9245",
  "org.scalablytyped" %%% "vscode-languageserver-protocol" % "3.14.1-17f67a",
  "org.scalablytyped" %%% "vscode-languageserver-types" % "3.14.0-3e2dc6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        