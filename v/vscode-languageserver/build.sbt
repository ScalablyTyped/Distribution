organization := "org.scalablytyped"
name := "vscode-languageserver"
version := "5.2.1-cc0ebf"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "12.6-dt-20190731Z-f93e3e",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc",
  "org.scalablytyped" %%% "vscode-jsonrpc" % "4.0.0-90aaba",
  "org.scalablytyped" %%% "vscode-languageserver-protocol" % "3.14.1-f8979e",
  "org.scalablytyped" %%% "vscode-languageserver-types" % "3.14.0-6b3acb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        