organization := "org.scalablytyped"
name := "vscode-languageclient"
version := "8.0.2-1f7457"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "std" % "4.8-686d1d",
  "org.scalablytyped" %%% "vscode" % "1.73-dt-20221103Z-5d8615",
  "org.scalablytyped" %%% "vscode-jsonrpc" % "8.0.2-52852c",
  "org.scalablytyped" %%% "vscode-languageserver-protocol" % "3.17.2-c59670",
  "org.scalablytyped" %%% "vscode-languageserver-types" % "3.17.2-82e113")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
