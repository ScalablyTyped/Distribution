organization := "org.scalablytyped"
name := "webcrypto-core"
version := "1.7.5-014034"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "peculiar__json-schema" % "1.1.12-dccbc9",
  "org.scalablytyped" %%% "pvtsutils" % "1.3.2-789a1d",
  "org.scalablytyped" %%% "std" % "4.8-958c79")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
