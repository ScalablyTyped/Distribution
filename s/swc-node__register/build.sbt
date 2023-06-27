organization := "org.scalablytyped"
name := "swc-node__register"
version := "1.5.4-06eb98"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "std" % "5.1-9d5ad2",
  "org.scalablytyped" %%% "swc-node__core" % "1.9.1-bed859",
  "org.scalablytyped" %%% "swc__core" % "1.3.10-7b194c",
  "org.scalablytyped" %%% "typescript" % "5.1.3-d4fd3b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
