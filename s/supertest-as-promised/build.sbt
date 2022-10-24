organization := "org.scalablytyped"
name := "supertest-as-promised"
version := "2.0-dt-20211202Z-3fd70b"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20220923Z-5a7a5b",
  "org.scalablytyped" %%% "cookiejar" % "2.1-dt-20211202Z-da621a",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221023Z-05fcff",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "superagent" % "4.1-dt-20220125Z-0994e8",
  "org.scalablytyped" %%% "supertest" % "v2.0.1-dt-20220818Z-0d186a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
