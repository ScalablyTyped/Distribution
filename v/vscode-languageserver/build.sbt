organization := "com.scalablytyped"
name := "vscode-languageserver"
version := "5.1.0-df8b02"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181116Z-806eaf",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "com.scalablytyped" %%% "vscode-jsonrpc" % "4.0.0-5887a8",
  "com.scalablytyped" %%% "vscode-languageserver-protocol" % "3.13.0-0f4018",
  "com.scalablytyped" %%% "vscode-languageserver-types" % "3.13.0-a5b175",
  "com.scalablytyped" %%% "vscode-uri" % "1.0.6-26e784",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        