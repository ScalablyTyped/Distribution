organization := "org.scalablytyped"
name := "vscode-languageclient"
version := "6.1.3-3e46e5"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-814aa8",
  "org.scalablytyped" %%% "std" % "4.1-044efb",
  "org.scalablytyped" %%% "vscode" % "1.51-dt-20201106Z-dc4a82",
  "org.scalablytyped" %%% "vscode-jsonrpc" % "5.0.1-0f0c27",
  "org.scalablytyped" %%% "vscode-languageserver-protocol" % "3.15.3-dac958",
  "org.scalablytyped" %%% "vscode-languageserver-types" % "3.15.1-216d3b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
