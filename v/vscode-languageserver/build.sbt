organization := "com.scalablytyped"
name := "vscode-languageserver"
version := "5.1.0-cf5c0d"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181121Z-5a910f",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "com.scalablytyped" %%% "vscode-jsonrpc" % "4.0.0-8a2726",
  "com.scalablytyped" %%% "vscode-languageserver-protocol" % "3.13.0-8195ec",
  "com.scalablytyped" %%% "vscode-languageserver-types" % "3.13.0-054b20",
  "com.scalablytyped" %%% "vscode-uri" % "1.0.6-213e45",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        