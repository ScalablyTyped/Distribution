organization := "org.scalablytyped"
name := "supertest-as-promised"
version := "2.0-dt-20211202Z-742b77"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20220819Z-8ddcaa",
  "org.scalablytyped" %%% "cookiejar" % "2.1-dt-20211202Z-232cef",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220913Z-77cc8d",
  "org.scalablytyped" %%% "std" % "4.8-958c79",
  "org.scalablytyped" %%% "superagent" % "4.1-dt-20220125Z-4c8313",
  "org.scalablytyped" %%% "supertest" % "v2.0.1-dt-20220818Z-4f8bbc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
