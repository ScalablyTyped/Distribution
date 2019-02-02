organization := "org.scalablytyped"
name := "vscode-languageclient"
version := "5.2.1-69f77a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-8da1df",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-45dbbd",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314",
  "org.scalablytyped" %%% "vscode-jsonrpc" % "4.0.0-91342f",
  "org.scalablytyped" %%% "vscode-languageserver-protocol" % "3.14.1-0cd894",
  "org.scalablytyped" %%% "vscode-languageserver-types" % "3.14.0-23dfb9")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        