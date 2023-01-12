organization := "org.scalablytyped"
name := "typedoc"
version := "0.23.21-3a0c5f"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "minimatch" % "5.1-dt-20220831Z-033b8a",
  "org.scalablytyped" %%% "shiki" % "0.11.1-6b6882",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb",
  "org.scalablytyped" %%% "typescript" % "4.9.3-94f598",
  "org.scalablytyped" %%% "vscode-textmate" % "7.0.1-ddade4")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
