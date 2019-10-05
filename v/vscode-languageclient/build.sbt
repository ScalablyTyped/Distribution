organization := "org.scalablytyped"
name := "vscode-languageclient"
version := "5.2.1-f8cf7d"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "12.7-dt-20191003Z-a35ed6",
  "org.scalablytyped" %%% "std" % "3.6-abb6d3",
  "org.scalablytyped" %%% "vscode" % "1.38-dt-20190904Z-2ceb6f",
  "org.scalablytyped" %%% "vscode-jsonrpc" % "4.0.0-88ffca",
  "org.scalablytyped" %%% "vscode-languageserver-protocol" % "3.14.1-0ddb6e",
  "org.scalablytyped" %%% "vscode-languageserver-types" % "3.14.0-c52906")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        