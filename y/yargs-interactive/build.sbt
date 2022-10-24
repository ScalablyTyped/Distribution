organization := "org.scalablytyped"
name := "yargs-interactive"
version := "2.1-dt-20211223Z-b9d045"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "yargs" % "17.0-dt-20220923Z-f31aee",
  "org.scalablytyped" %%% "yargs-parser" % "21.0-dt-20220624Z-7e97d3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
