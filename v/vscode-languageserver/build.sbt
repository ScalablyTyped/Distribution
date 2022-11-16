organization := "org.scalablytyped"
name := "vscode-languageserver"
version := "8.0.2-c47db5"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "std" % "4.9-c133ce",
  "org.scalablytyped" %%% "vscode-jsonrpc" % "8.0.2-c67327",
  "org.scalablytyped" %%% "vscode-languageserver-protocol" % "3.17.2-5fbad0",
  "org.scalablytyped" %%% "vscode-languageserver-types" % "3.17.2-fb741b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
