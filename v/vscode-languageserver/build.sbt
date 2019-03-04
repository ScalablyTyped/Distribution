organization := "org.scalablytyped"
name := "vscode-languageserver"
version := "5.3.0-next.1-6b355b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-fd0a52",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "vscode-jsonrpc" % "4.0.0-d68fad",
  "org.scalablytyped" %%% "vscode-languageserver-protocol" % "3.15.0-next.1-bfc8a5",
  "org.scalablytyped" %%% "vscode-languageserver-types" % "3.14.0-70e92a",
  "org.scalablytyped" %%% "vscode-uri" % "1.0.6-c48956")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        