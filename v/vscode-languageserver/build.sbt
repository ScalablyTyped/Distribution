organization := "org.scalablytyped"
name := "vscode-languageserver"
version := "5.2.1-895ac0"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190611Z-b8909f",
  "org.scalablytyped" %%% "std" % "3.5-d4a303",
  "org.scalablytyped" %%% "vscode-jsonrpc" % "4.0.0-f2538a",
  "org.scalablytyped" %%% "vscode-languageserver-protocol" % "3.14.1-56f568",
  "org.scalablytyped" %%% "vscode-languageserver-types" % "3.14.0-f173c5")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        