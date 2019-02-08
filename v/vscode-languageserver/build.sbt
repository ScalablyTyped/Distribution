organization := "org.scalablytyped"
name := "vscode-languageserver"
version := "5.2.1-11c8fa"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190206Z-9f73ab",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "vscode-jsonrpc" % "4.0.0-45da9d",
  "org.scalablytyped" %%% "vscode-languageserver-protocol" % "3.14.1-3fe1a6",
  "org.scalablytyped" %%% "vscode-languageserver-types" % "3.14.0-b95f34",
  "org.scalablytyped" %%% "vscode-uri" % "1.0.6-d1c529")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        