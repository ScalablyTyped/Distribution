organization := "org.scalablytyped"
name := "vscode-languageserver"
version := "5.2.1-f7a2dc"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181214Z-702cdc",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f",
  "org.scalablytyped" %%% "vscode-jsonrpc" % "4.0.0-19abbd",
  "org.scalablytyped" %%% "vscode-languageserver-protocol" % "3.14.1-1bb486",
  "org.scalablytyped" %%% "vscode-languageserver-types" % "3.14.0-4db8d9",
  "org.scalablytyped" %%% "vscode-uri" % "1.0.6-7f0768")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        