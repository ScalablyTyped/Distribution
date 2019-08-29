organization := "org.scalablytyped"
name := "vscode-languageclient"
version := "5.2.1-722a47"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190820Z-c250b3",
  "org.scalablytyped" %%% "std" % "3.6-c16502",
  "org.scalablytyped" %%% "vscode" % "1.37-dt-20190808Z-64545e",
  "org.scalablytyped" %%% "vscode-jsonrpc" % "4.0.0-a34a24",
  "org.scalablytyped" %%% "vscode-languageserver-protocol" % "3.14.1-cb231c",
  "org.scalablytyped" %%% "vscode-languageserver-types" % "3.14.0-40ce5f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        