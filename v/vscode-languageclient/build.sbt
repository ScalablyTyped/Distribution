organization := "org.scalablytyped"
name := "vscode-languageclient"
version := "8.0.2-85cd8d"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "std" % "4.9-5f989f",
  "org.scalablytyped" %%% "vscode" % "1.73-dt-20221115Z-613312",
  "org.scalablytyped" %%% "vscode-jsonrpc" % "8.0.2-77bab6",
  "org.scalablytyped" %%% "vscode-languageserver-protocol" % "3.17.2-ce7387",
  "org.scalablytyped" %%% "vscode-languageserver-types" % "3.17.2-450d92")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
