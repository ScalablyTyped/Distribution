organization := "org.scalablytyped"
name := "vscode-languageclient"
version := "5.2.1-dc9e76"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "13.7-dt-20200211Z-d6af7e",
  "org.scalablytyped" %%% "std" % "3.7-1b8369",
  "org.scalablytyped" %%% "vscode" % "1.42-dt-20200206Z-92579b",
  "org.scalablytyped" %%% "vscode-jsonrpc" % "4.0.0-aa3110",
  "org.scalablytyped" %%% "vscode-languageserver-protocol" % "3.14.1-d7260f",
  "org.scalablytyped" %%% "vscode-languageserver-types" % "3.15.1-2497ba")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
