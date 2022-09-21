organization := "org.scalablytyped"
name := "typedoc"
version := "0.23.15-8dd187"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "minimatch" % "5.1-dt-20220831Z-a8ea5b",
  "org.scalablytyped" %%% "shiki" % "0.11.1-08acaa",
  "org.scalablytyped" %%% "std" % "4.8-958c79",
  "org.scalablytyped" %%% "typescript" % "4.8.3-775b25",
  "org.scalablytyped" %%% "vscode-textmate" % "7.0.1-c85717")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
