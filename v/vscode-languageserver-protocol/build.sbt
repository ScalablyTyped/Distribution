organization := "org.scalablytyped"
name := "vscode-languageserver-protocol"
version := "3.17.2-ea9e7c"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "std" % "4.8-958c79",
  "org.scalablytyped" %%% "vscode-jsonrpc" % "8.0.2-ddf70f",
  "org.scalablytyped" %%% "vscode-languageserver-types" % "3.17.2-bd706c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
