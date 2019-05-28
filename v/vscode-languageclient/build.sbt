organization := "org.scalablytyped"
name := "vscode-languageclient"
version := "5.2.1-f3be51"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190517Z-1fb914",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2",
  "org.scalablytyped" %%% "vscode" % "1.34-dt-20190516Z-dcf8d3",
  "org.scalablytyped" %%% "vscode-jsonrpc" % "4.0.0-28046e",
  "org.scalablytyped" %%% "vscode-languageserver-protocol" % "3.14.1-e64f81",
  "org.scalablytyped" %%% "vscode-languageserver-types" % "3.14.0-dc237d")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        