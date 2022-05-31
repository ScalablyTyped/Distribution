organization := "org.scalablytyped"
name := "vscode-languageclient"
version := "6.1.3-51ddc5"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-11c649",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab",
  "org.scalablytyped" %%% "vscode" % "1.51-dt-20201106Z-9dff2c",
  "org.scalablytyped" %%% "vscode-jsonrpc" % "5.0.1-808a12",
  "org.scalablytyped" %%% "vscode-languageserver-protocol" % "3.15.3-e40ba8",
  "org.scalablytyped" %%% "vscode-languageserver-types" % "3.15.1-690a91")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
