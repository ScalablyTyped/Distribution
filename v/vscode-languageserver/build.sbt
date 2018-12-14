organization := "org.scalablytyped"
name := "vscode-languageserver"
version := "5.2.1-15ecf3"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181214Z-21ad57",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79",
  "org.scalablytyped" %%% "vscode-jsonrpc" % "4.0.0-b409fa",
  "org.scalablytyped" %%% "vscode-languageserver-protocol" % "3.14.1-ab0d32",
  "org.scalablytyped" %%% "vscode-languageserver-types" % "3.14.0-04b716",
  "org.scalablytyped" %%% "vscode-uri" % "1.0.6-b39427")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        