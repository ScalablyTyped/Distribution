organization := "org.scalablytyped"
name := "vscode-languageclient"
version := "5.2.1-27ff9f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190429Z-40b461",
  "org.scalablytyped" %%% "std" % "3.4-495f93",
  "org.scalablytyped" %%% "vscode" % "1.33-dt-20190404Z-e369e4",
  "org.scalablytyped" %%% "vscode-jsonrpc" % "4.0.0-f44855",
  "org.scalablytyped" %%% "vscode-languageserver-protocol" % "3.14.1-491c1a",
  "org.scalablytyped" %%% "vscode-languageserver-types" % "3.14.0-44aaf1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        