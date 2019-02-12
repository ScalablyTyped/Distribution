organization := "org.scalablytyped"
name := "vscode-languageserver"
version := "5.3.0-next.1-082b12"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190211Z-6a64f2",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "vscode-jsonrpc" % "4.0.0-c4cc4d",
  "org.scalablytyped" %%% "vscode-languageserver-protocol" % "3.15.0-next.1-a65f39",
  "org.scalablytyped" %%% "vscode-languageserver-types" % "3.14.0-b95f34",
  "org.scalablytyped" %%% "vscode-uri" % "1.0.6-d1c529")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        