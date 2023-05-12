organization := "org.scalablytyped"
name := "vscode-languageserver"
version := "8.1.0-966dac"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "vscode-jsonrpc" % "8.1.0-ad66d2",
  "org.scalablytyped" %%% "vscode-languageserver-protocol" % "3.17.3-732e13",
  "org.scalablytyped" %%% "vscode-languageserver-types" % "3.17.3-cbfe6a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
