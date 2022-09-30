organization := "org.scalablytyped"
name := "xadesjs"
version := "2.4.4-0f26a4"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb",
  "org.scalablytyped" %%% "xml-core" % "1.1.5-80fbab",
  "org.scalablytyped" %%% "xmldsigjs" % "2.5.0-35ce53")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
