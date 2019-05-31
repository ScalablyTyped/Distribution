organization := "org.scalablytyped"
name := "vscode-languageserver"
version := "5.2.1-4ee650"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190530Z-a47442",
  "org.scalablytyped" %%% "std" % "3.5-f010ac",
  "org.scalablytyped" %%% "vscode-jsonrpc" % "4.0.0-06be75",
  "org.scalablytyped" %%% "vscode-languageserver-protocol" % "3.14.1-fbf30f",
  "org.scalablytyped" %%% "vscode-languageserver-types" % "3.14.0-fba3f7")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        