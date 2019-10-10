organization := "org.scalablytyped"
name := "vscode-languageclient"
version := "5.2.1-9fd0fb"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "12.7-dt-20191008Z-8637fd",
  "org.scalablytyped" %%% "std" % "3.6-abb6d3",
  "org.scalablytyped" %%% "vscode" % "1.39-dt-20191010Z-0916e0",
  "org.scalablytyped" %%% "vscode-jsonrpc" % "4.0.0-1047b0",
  "org.scalablytyped" %%% "vscode-languageserver-protocol" % "3.14.1-f65ca8",
  "org.scalablytyped" %%% "vscode-languageserver-types" % "3.14.0-c52906")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        