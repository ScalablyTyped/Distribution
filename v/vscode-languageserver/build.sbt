organization := "org.scalablytyped"
name := "vscode-languageserver"
version := "5.2.1-429809"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191030Z-4bf573",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a",
  "org.scalablytyped" %%% "vscode-jsonrpc" % "4.0.0-85e6c9",
  "org.scalablytyped" %%% "vscode-languageserver-protocol" % "3.14.1-362add",
  "org.scalablytyped" %%% "vscode-languageserver-types" % "3.14.0-1f6a01")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        