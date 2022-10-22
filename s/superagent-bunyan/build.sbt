organization := "org.scalablytyped"
name := "superagent-bunyan"
version := "5.2-dt-20211202Z-fdd483"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20211202Z-7d8e65",
  "org.scalablytyped" %%% "cookiejar" % "2.1-dt-20211202Z-6bed9b",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221020Z-d73de4",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "superagent" % "4.1-dt-20220125Z-14f083")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
