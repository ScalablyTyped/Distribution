organization := "org.scalablytyped"
name := "three-dat_dot_gui"
version := "2.0-dt-20211202Z-0a39e2"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb",
  "org.scalablytyped" %%% "three" % "0.146-dt-20221106Z-9f51e0",
  "org.scalablytyped" %%% "webxr" % "0.5-dt-20220721Z-bbf918")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
