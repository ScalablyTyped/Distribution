organization := "org.scalablytyped"
name := "vscode-languageclient"
version := "8.0.2-7daa5f"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "vscode" % "1.72-dt-20221006Z-2e4690",
  "org.scalablytyped" %%% "vscode-jsonrpc" % "8.0.2-ff8bae",
  "org.scalablytyped" %%% "vscode-languageserver-protocol" % "3.17.2-d692a3",
  "org.scalablytyped" %%% "vscode-languageserver-types" % "3.17.2-54eeda")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
