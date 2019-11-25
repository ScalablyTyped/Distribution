organization := "org.scalablytyped"
name := "vscode-languageclient"
version := "5.2.1-fab0b7"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191123Z-382692",
  "org.scalablytyped" %%% "std" % "3.7-1d724d",
  "org.scalablytyped" %%% "vscode" % "1.40-dt-20191107Z-96b7ff",
  "org.scalablytyped" %%% "vscode-jsonrpc" % "4.0.0-5ad886",
  "org.scalablytyped" %%% "vscode-languageserver-protocol" % "3.14.1-296739",
  "org.scalablytyped" %%% "vscode-languageserver-types" % "3.14.0-17335f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        