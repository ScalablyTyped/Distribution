organization := "org.scalablytyped"
name := "vscode-languageserver"
version := "5.2.1-a70494"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190911Z-da4655",
  "org.scalablytyped" %%% "std" % "3.6-c16502",
  "org.scalablytyped" %%% "vscode-jsonrpc" % "4.0.0-fa6c26",
  "org.scalablytyped" %%% "vscode-languageserver-protocol" % "3.14.1-30c0d4",
  "org.scalablytyped" %%% "vscode-languageserver-types" % "3.14.0-40ce5f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        