organization := "org.scalablytyped"
name := "vscode-languageclient"
version := "5.2.1-e708e8"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200103Z-51871a",
  "org.scalablytyped" %%% "std" % "3.7-b6d959",
  "org.scalablytyped" %%% "vscode" % "1.41-dt-20191212Z-b9f101",
  "org.scalablytyped" %%% "vscode-jsonrpc" % "4.0.0-c01ce1",
  "org.scalablytyped" %%% "vscode-languageserver-protocol" % "3.14.1-e541ca",
  "org.scalablytyped" %%% "vscode-languageserver-types" % "3.14.0-92e20d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        