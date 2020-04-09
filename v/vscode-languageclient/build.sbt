organization := "org.scalablytyped"
name := "vscode-languageclient"
version := "6.1.3-d3bac9"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "13.11-dt-20200402Z-9a87f0",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "vscode" % "1.43-dt-20200309Z-8a7e01",
  "org.scalablytyped" %%% "vscode-jsonrpc" % "5.0.1-0098f9",
  "org.scalablytyped" %%% "vscode-languageserver-protocol" % "3.15.3-96c0e4",
  "org.scalablytyped" %%% "vscode-languageserver-types" % "3.15.1-e3a696")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
