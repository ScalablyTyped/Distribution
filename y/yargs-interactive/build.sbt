organization := "org.scalablytyped"
name := "yargs-interactive"
version := "2.1-dt-20211223Z-880f3e"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "std" % "4.8-958c79",
  "org.scalablytyped" %%% "yargs" % "17.0-dt-20220829Z-a8b7c8",
  "org.scalablytyped" %%% "yargs-parser" % "21.0-dt-20220624Z-2bf344")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
