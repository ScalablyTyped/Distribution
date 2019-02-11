organization := "org.scalablytyped"
name := "vscode-languageserver"
version := "5.3.0-next.1-8adc4a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190206Z-3468e4",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "vscode-jsonrpc" % "4.0.0-fe00bd",
  "org.scalablytyped" %%% "vscode-languageserver-protocol" % "3.15.0-next.1-e0e52c",
  "org.scalablytyped" %%% "vscode-languageserver-types" % "3.14.0-b95f34",
  "org.scalablytyped" %%% "vscode-uri" % "1.0.6-d1c529")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        