organization := "org.scalablytyped"
name := "vscode-languageclient"
version := "6.1.1-c8f001"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "13.7-dt-20200211Z-b30bde",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "vscode" % "1.42-dt-20200206Z-3254a0",
  "org.scalablytyped" %%% "vscode-jsonrpc" % "5.0.1-7e92cc",
  "org.scalablytyped" %%% "vscode-languageserver-protocol" % "3.15.3-73f9d9",
  "org.scalablytyped" %%% "vscode-languageserver-types" % "3.15.1-e3a696")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
