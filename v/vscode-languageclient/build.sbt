organization := "org.scalablytyped"
name := "vscode-languageclient"
version := "6.1.3-e774a1"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-e00132",
  "org.scalablytyped" %%% "std" % "4.1-2f6855",
  "org.scalablytyped" %%% "vscode" % "1.51-dt-20201106Z-49f340",
  "org.scalablytyped" %%% "vscode-jsonrpc" % "5.0.1-7c2316",
  "org.scalablytyped" %%% "vscode-languageserver-protocol" % "3.15.3-43e167",
  "org.scalablytyped" %%% "vscode-languageserver-types" % "3.15.1-1691a5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
