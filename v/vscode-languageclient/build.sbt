organization := "org.scalablytyped"
name := "vscode-languageclient"
version := "5.2.1-593467"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "12.11-dt-20191024Z-c10572",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a",
  "org.scalablytyped" %%% "vscode" % "1.39-dt-20191010Z-053d7a",
  "org.scalablytyped" %%% "vscode-jsonrpc" % "4.0.0-dc2836",
  "org.scalablytyped" %%% "vscode-languageserver-protocol" % "3.14.1-2be877",
  "org.scalablytyped" %%% "vscode-languageserver-types" % "3.14.0-1f6a01")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        