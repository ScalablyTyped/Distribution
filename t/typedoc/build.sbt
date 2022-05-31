organization := "org.scalablytyped"
name := "typedoc"
version := "0.19.2-9a3a5f"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "handlebars" % "4.7.6-86e5d1",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20200515Z-e93439",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab",
  "org.scalablytyped" %%% "typescript" % "4.1.2-b460a1")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
