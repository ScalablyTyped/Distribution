organization := "org.scalablytyped"
name := "webdriver"
version := "7.25.1-a76365"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221020Z-d73de4",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "typescript" % "4.8.4-676e37",
  "org.scalablytyped" %%% "wdio__protocols" % "7.22.0-46c39a",
  "org.scalablytyped" %%% "wdio__types" % "7.25.1-9e2d80")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
