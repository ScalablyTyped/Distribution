organization := "org.scalablytyped"
name := "vscode-languageclient"
version := "5.2.1-31f294"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190503Z-cb8223",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2",
  "org.scalablytyped" %%% "vscode" % "1.33-dt-20190404Z-1269ba",
  "org.scalablytyped" %%% "vscode-jsonrpc" % "4.0.0-1349b3",
  "org.scalablytyped" %%% "vscode-languageserver-protocol" % "3.14.1-924254",
  "org.scalablytyped" %%% "vscode-languageserver-types" % "3.14.0-dc237d")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        