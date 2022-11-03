organization := "org.scalablytyped"
name := "vscode-languageclient"
version := "8.0.2-614d8a"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "vscode" % "1.73-dt-20221103Z-1d0337",
  "org.scalablytyped" %%% "vscode-jsonrpc" % "8.0.2-6b8f3c",
  "org.scalablytyped" %%% "vscode-languageserver-protocol" % "3.17.2-990c2c",
  "org.scalablytyped" %%% "vscode-languageserver-types" % "3.17.2-2c21b2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
