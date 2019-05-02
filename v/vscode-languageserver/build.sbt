organization := "org.scalablytyped"
name := "vscode-languageserver"
version := "5.3.0-next.5-c2439a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190502Z-d681c7",
  "org.scalablytyped" %%% "std" % "3.4-495f93",
  "org.scalablytyped" %%% "vscode-jsonrpc" % "4.0.0-f5aa28",
  "org.scalablytyped" %%% "vscode-languageserver-protocol" % "3.14.1-84cb7f",
  "org.scalablytyped" %%% "vscode-languageserver-types" % "3.14.0-44aaf1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        