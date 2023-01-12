organization := "org.scalablytyped"
name := "vscode-languageclient"
version := "8.0.2-811b3a"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb",
  "org.scalablytyped" %%% "vscode" % "1.73-dt-20221115Z-c4fd03",
  "org.scalablytyped" %%% "vscode-jsonrpc" % "8.0.2-53cc71",
  "org.scalablytyped" %%% "vscode-languageserver-protocol" % "3.17.2-a434eb",
  "org.scalablytyped" %%% "vscode-languageserver-types" % "3.17.2-faed9c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
