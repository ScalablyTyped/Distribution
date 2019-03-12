organization := "org.scalablytyped"
name := "vscode-languageserver"
version := "5.3.0-next.1-8163cf"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190311Z-8b4969",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "vscode-jsonrpc" % "4.0.0-3603a0",
  "org.scalablytyped" %%% "vscode-languageserver-protocol" % "3.14.1-08983f",
  "org.scalablytyped" %%% "vscode-languageserver-types" % "3.14.0-6de151",
  "org.scalablytyped" %%% "vscode-uri" % "1.0.6-abcb79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        