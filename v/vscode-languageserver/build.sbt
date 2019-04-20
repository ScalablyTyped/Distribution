organization := "org.scalablytyped"
name := "vscode-languageserver"
version := "5.3.0-next.5-4b2769"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190419Z-3f0246",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc",
  "org.scalablytyped" %%% "vscode-jsonrpc" % "4.0.0-6a8c94",
  "org.scalablytyped" %%% "vscode-languageserver-protocol" % "3.14.1-ff43fe",
  "org.scalablytyped" %%% "vscode-languageserver-types" % "3.14.0-65a358")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        