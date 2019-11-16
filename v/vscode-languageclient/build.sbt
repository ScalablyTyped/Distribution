organization := "org.scalablytyped"
name := "vscode-languageclient"
version := "5.2.1-d6f7f5"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191115Z-3b62fb",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf",
  "org.scalablytyped" %%% "vscode" % "1.40-dt-20191107Z-71a981",
  "org.scalablytyped" %%% "vscode-jsonrpc" % "4.0.0-3fe5fe",
  "org.scalablytyped" %%% "vscode-languageserver-protocol" % "3.14.1-13edf3",
  "org.scalablytyped" %%% "vscode-languageserver-types" % "3.14.0-605b28")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        