organization := "org.scalablytyped"
name := "vscode-languageclient"
version := "5.2.1-276aaa"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200117Z-4be21b",
  "org.scalablytyped" %%% "std" % "3.7-96076c",
  "org.scalablytyped" %%% "vscode" % "1.41-dt-20191212Z-dca798",
  "org.scalablytyped" %%% "vscode-jsonrpc" % "4.0.0-c6b900",
  "org.scalablytyped" %%% "vscode-languageserver-protocol" % "3.14.1-52fe1a",
  "org.scalablytyped" %%% "vscode-languageserver-types" % "3.15.0-ceda68")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        