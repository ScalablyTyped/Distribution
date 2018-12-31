organization := "org.scalablytyped"
name := "vscode-languageclient"
version := "5.2.1-77d1d8"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-77ce7e",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-5afbca",
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff",
  "org.scalablytyped" %%% "vscode-jsonrpc" % "4.0.0-aa9ad5",
  "org.scalablytyped" %%% "vscode-languageserver-protocol" % "3.14.1-f274a5",
  "org.scalablytyped" %%% "vscode-languageserver-types" % "3.14.0-a7501d")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        