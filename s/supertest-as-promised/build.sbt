organization := "org.scalablytyped"
name := "supertest-as-promised"
version := "2.0-dt-20211202Z-fb5a8b"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20230328Z-ea1cbb",
  "org.scalablytyped" %%% "cookiejar" % "2.1-dt-20211202Z-e10e4c",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230513Z-b25634",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "superagent" % "4.1-dt-20230426Z-80c0ce",
  "org.scalablytyped" %%% "supertest" % "v2.0.1-dt-20220818Z-e4bbc3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
