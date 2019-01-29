organization := "org.scalablytyped"
name := "vscode-languageserver"
version := "5.2.1-ebcf4c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190128Z-23a585",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1",
  "org.scalablytyped" %%% "vscode-jsonrpc" % "4.0.0-2b8f44",
  "org.scalablytyped" %%% "vscode-languageserver-protocol" % "3.14.1-9209f7",
  "org.scalablytyped" %%% "vscode-languageserver-types" % "3.14.0-2fd249",
  "org.scalablytyped" %%% "vscode-uri" % "1.0.6-5606c7")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        