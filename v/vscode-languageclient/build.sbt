organization := "org.scalablytyped"
name := "vscode-languageclient"
version := "5.2.1-c5418c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190611Z-76ef23",
  "org.scalablytyped" %%% "std" % "3.5-c5d119",
  "org.scalablytyped" %%% "vscode" % "1.35-dt-20190605Z-c8078e",
  "org.scalablytyped" %%% "vscode-jsonrpc" % "4.0.0-c69956",
  "org.scalablytyped" %%% "vscode-languageserver-protocol" % "3.14.1-255827",
  "org.scalablytyped" %%% "vscode-languageserver-types" % "3.14.0-a3f4d2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        