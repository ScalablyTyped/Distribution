organization := "org.scalablytyped"
name := "vscode-languageclient"
version := "5.2.1-87200d"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191105Z-2397f3",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf",
  "org.scalablytyped" %%% "vscode" % "1.39-dt-20191010Z-8d26d1",
  "org.scalablytyped" %%% "vscode-jsonrpc" % "4.0.0-d03a21",
  "org.scalablytyped" %%% "vscode-languageserver-protocol" % "3.14.1-beec62",
  "org.scalablytyped" %%% "vscode-languageserver-types" % "3.14.0-605b28")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        