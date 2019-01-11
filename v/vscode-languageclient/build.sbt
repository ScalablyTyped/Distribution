organization := "org.scalablytyped"
name := "vscode-languageclient"
version := "5.2.1-2a1d4b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2be335",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-6f52c3",
  "org.scalablytyped" %%% "std" % "3.2.2-2926f1",
  "org.scalablytyped" %%% "vscode-jsonrpc" % "4.0.0-fe7a6f",
  "org.scalablytyped" %%% "vscode-languageserver-protocol" % "3.14.1-838531",
  "org.scalablytyped" %%% "vscode-languageserver-types" % "3.14.0-a810d1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        