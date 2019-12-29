organization := "org.scalablytyped"
name := "vscode-languageserver"
version := "5.2.1-4d865c"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "13.1-dt-20191226Z-155d58",
  "org.scalablytyped" %%% "std" % "3.7-953338",
  "org.scalablytyped" %%% "vscode-jsonrpc" % "4.0.0-a2fcea",
  "org.scalablytyped" %%% "vscode-languageserver-protocol" % "3.14.1-2b8dae",
  "org.scalablytyped" %%% "vscode-languageserver-types" % "3.14.0-88088a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        