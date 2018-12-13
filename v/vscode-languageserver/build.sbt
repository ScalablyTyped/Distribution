organization := "org.scalablytyped"
name := "vscode-languageserver"
version := "5.2.1-6bd212"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181213Z-bd3349",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79",
  "org.scalablytyped" %%% "vscode-jsonrpc" % "4.0.0-15b83f",
  "org.scalablytyped" %%% "vscode-languageserver-protocol" % "3.14.1-fdb9f1",
  "org.scalablytyped" %%% "vscode-languageserver-types" % "3.14.0-04b716",
  "org.scalablytyped" %%% "vscode-uri" % "1.0.6-b39427")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        