organization := "org.scalablytyped"
name := "vscode-languageserver"
version := "5.1.0-58251f"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-df5d12",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79",
  "org.scalablytyped" %%% "vscode-jsonrpc" % "4.0.0-6bdfba",
  "org.scalablytyped" %%% "vscode-languageserver-protocol" % "3.13.0-b89e61",
  "org.scalablytyped" %%% "vscode-languageserver-types" % "3.13.0-866359",
  "org.scalablytyped" %%% "vscode-uri" % "1.0.6-b39427")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        