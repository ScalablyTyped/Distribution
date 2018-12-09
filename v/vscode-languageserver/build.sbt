organization := "org.scalablytyped"
name := "vscode-languageserver"
version := "5.1.0-ae463b"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-646a31",
  "org.scalablytyped" %%% "std" % "3.2.2-edfe2b",
  "org.scalablytyped" %%% "vscode-jsonrpc" % "4.0.0-7bacb1",
  "org.scalablytyped" %%% "vscode-languageserver-protocol" % "3.13.0-d051da",
  "org.scalablytyped" %%% "vscode-languageserver-types" % "3.13.0-5afd56",
  "org.scalablytyped" %%% "vscode-uri" % "1.0.6-d8ced6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        