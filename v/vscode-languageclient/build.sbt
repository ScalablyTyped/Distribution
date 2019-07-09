organization := "org.scalablytyped"
name := "vscode-languageclient"
version := "5.2.1-258a62"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "12.6-dt-20190708Z-e1e986",
  "org.scalablytyped" %%% "std" % "3.5-983486",
  "org.scalablytyped" %%% "vscode" % "1.36-dt-20190703Z-03e64b",
  "org.scalablytyped" %%% "vscode-jsonrpc" % "4.0.0-9866df",
  "org.scalablytyped" %%% "vscode-languageserver-protocol" % "3.14.1-d3cc7c",
  "org.scalablytyped" %%% "vscode-languageserver-types" % "3.14.0-8a2ee1")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        