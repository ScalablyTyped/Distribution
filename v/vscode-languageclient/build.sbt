organization := "org.scalablytyped"
name := "vscode-languageclient"
version := "5.2.1-06a9f1"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190621Z-8f9d23",
  "org.scalablytyped" %%% "std" % "3.5-d4a303",
  "org.scalablytyped" %%% "vscode" % "1.35-dt-20190605Z-1e76c1",
  "org.scalablytyped" %%% "vscode-jsonrpc" % "4.0.0-e28ab7",
  "org.scalablytyped" %%% "vscode-languageserver-protocol" % "3.14.1-380033",
  "org.scalablytyped" %%% "vscode-languageserver-types" % "3.14.0-f173c5")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        