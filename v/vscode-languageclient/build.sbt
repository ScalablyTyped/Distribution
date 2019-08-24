organization := "org.scalablytyped"
name := "vscode-languageclient"
version := "5.2.1-c3409d"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190820Z-2dc4df",
  "org.scalablytyped" %%% "std" % "3.5-cd493c",
  "org.scalablytyped" %%% "vscode" % "1.37-dt-20190808Z-063342",
  "org.scalablytyped" %%% "vscode-jsonrpc" % "4.0.0-7530af",
  "org.scalablytyped" %%% "vscode-languageserver-protocol" % "3.14.1-c5110c",
  "org.scalablytyped" %%% "vscode-languageserver-types" % "3.14.0-b637e4")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        