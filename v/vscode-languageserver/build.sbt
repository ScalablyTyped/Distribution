organization := "org.scalablytyped"
name := "vscode-languageserver"
version := "5.2.1-d6b306"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191210Z-b5c359",
  "org.scalablytyped" %%% "std" % "3.7-1d724d",
  "org.scalablytyped" %%% "vscode-jsonrpc" % "4.0.0-6eeb6d",
  "org.scalablytyped" %%% "vscode-languageserver-protocol" % "3.14.1-67599c",
  "org.scalablytyped" %%% "vscode-languageserver-types" % "3.14.0-e2e715")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        