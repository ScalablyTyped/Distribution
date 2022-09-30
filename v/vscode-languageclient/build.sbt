organization := "org.scalablytyped"
name := "vscode-languageclient"
version := "8.0.2-9a9eb2"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb",
  "org.scalablytyped" %%% "vscode" % "1.71-dt-20220901Z-073904",
  "org.scalablytyped" %%% "vscode-jsonrpc" % "8.0.2-742787",
  "org.scalablytyped" %%% "vscode-languageserver-protocol" % "3.17.2-a3a804",
  "org.scalablytyped" %%% "vscode-languageserver-types" % "3.17.2-d3e280")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
