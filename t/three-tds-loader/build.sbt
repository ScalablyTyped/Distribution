organization := "org.scalablytyped"
name := "three-tds-loader"
version := "1.1-dt-20211202Z-476832"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "std" % "4.8-686d1d",
  "org.scalablytyped" %%% "three" % "0.146-dt-20221106Z-23abf2",
  "org.scalablytyped" %%% "webxr" % "0.5-dt-20220721Z-4a9bb7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
