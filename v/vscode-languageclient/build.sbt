organization := "org.scalablytyped"
name := "vscode-languageclient"
version := "5.2.1-dac4d0"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190807Z-ed4b3f",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc",
  "org.scalablytyped" %%% "vscode" % "1.37-dt-20190808Z-31d84f",
  "org.scalablytyped" %%% "vscode-jsonrpc" % "4.0.0-8f6c27",
  "org.scalablytyped" %%% "vscode-languageserver-protocol" % "3.14.1-8b5415",
  "org.scalablytyped" %%% "vscode-languageserver-types" % "3.14.0-6b3acb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        