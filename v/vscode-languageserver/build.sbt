organization := "com.scalablytyped"
name := "vscode-languageserver"
version := "5.1.0-e77cc0"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181203Z-7004b3",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "com.scalablytyped" %%% "vscode-jsonrpc" % "4.0.0-033440",
  "com.scalablytyped" %%% "vscode-languageserver-protocol" % "3.13.0-7cea5e",
  "com.scalablytyped" %%% "vscode-languageserver-types" % "3.13.0-e49e40",
  "com.scalablytyped" %%% "vscode-uri" % "1.0.6-a220aa",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        