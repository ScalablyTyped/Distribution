organization := "org.scalablytyped"
name := "vscode-languageclient"
version := "5.2.1-97f259"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190806Z-18826b",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc",
  "org.scalablytyped" %%% "vscode" % "1.36-dt-20190717Z-393245",
  "org.scalablytyped" %%% "vscode-jsonrpc" % "4.0.0-e5b3fc",
  "org.scalablytyped" %%% "vscode-languageserver-protocol" % "3.14.1-2aa637",
  "org.scalablytyped" %%% "vscode-languageserver-types" % "3.14.0-6b3acb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        