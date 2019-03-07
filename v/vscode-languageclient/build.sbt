organization := "org.scalablytyped"
name := "vscode-languageclient"
version := "5.3.0-next.1-d473d0"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190302Z-6be09d",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-cfbe1c",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "vscode-jsonrpc" % "4.0.0-156519",
  "org.scalablytyped" %%% "vscode-languageserver-protocol" % "3.15.0-next.1-be7d83",
  "org.scalablytyped" %%% "vscode-languageserver-types" % "3.14.0-70e92a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        