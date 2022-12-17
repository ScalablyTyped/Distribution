organization := "org.scalablytyped"
name := "yargs-interactive"
version := "2.1-dt-20211223Z-e59e5d"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "std" % "4.9-5f989f",
  "org.scalablytyped" %%% "yargs" % "17.0-dt-20221114Z-f77e52",
  "org.scalablytyped" %%% "yargs-parser" % "21.0-dt-20220624Z-8e893f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
