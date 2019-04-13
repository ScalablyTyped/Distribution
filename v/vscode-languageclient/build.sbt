organization := "org.scalablytyped"
name := "vscode-languageclient"
version := "5.2.1-5ea814"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190409Z-28d4e0",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc",
  "org.scalablytyped" %%% "vscode" % "1.33-dt-20190404Z-2015a2",
  "org.scalablytyped" %%% "vscode-jsonrpc" % "4.0.0-0cd942",
  "org.scalablytyped" %%% "vscode-languageserver-protocol" % "3.14.1-8dd64b",
  "org.scalablytyped" %%% "vscode-languageserver-types" % "3.14.0-65a358")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        