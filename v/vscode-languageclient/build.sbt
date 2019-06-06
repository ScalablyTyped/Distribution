organization := "org.scalablytyped"
name := "vscode-languageclient"
version := "5.2.1-47ac20"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190605Z-895d8c",
  "org.scalablytyped" %%% "std" % "3.5-f010ac",
  "org.scalablytyped" %%% "vscode" % "1.35-dt-20190605Z-02704b",
  "org.scalablytyped" %%% "vscode-jsonrpc" % "4.0.0-f8f729",
  "org.scalablytyped" %%% "vscode-languageserver-protocol" % "3.14.1-12c0e5",
  "org.scalablytyped" %%% "vscode-languageserver-types" % "3.14.0-fba3f7")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        