organization := "org.scalablytyped"
name := "vscode-languageclient"
version := "5.3.0-next.1-05c17e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190213Z-604ea6",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-c9e889",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "vscode-jsonrpc" % "4.0.0-bfe12e",
  "org.scalablytyped" %%% "vscode-languageserver-protocol" % "3.15.0-next.1-c3a5f0",
  "org.scalablytyped" %%% "vscode-languageserver-types" % "3.14.0-b95f34")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        