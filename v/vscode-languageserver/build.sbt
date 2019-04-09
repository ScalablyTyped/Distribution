organization := "org.scalablytyped"
name := "vscode-languageserver"
version := "5.3.0-next.1-df02bd"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190408Z-6fa8bf",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "vscode-jsonrpc" % "4.0.0-9ddd26",
  "org.scalablytyped" %%% "vscode-languageserver-protocol" % "3.14.1-908010",
  "org.scalablytyped" %%% "vscode-languageserver-types" % "3.14.0-3e2dc6",
  "org.scalablytyped" %%% "vscode-uri" % "1.0.6-5f41a6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        