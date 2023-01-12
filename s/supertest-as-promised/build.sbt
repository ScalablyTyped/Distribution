organization := "org.scalablytyped"
name := "supertest-as-promised"
version := "2.0-dt-20211202Z-ce637b"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20221103Z-1882ae",
  "org.scalablytyped" %%% "cookiejar" % "2.1-dt-20211202Z-4a1704",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-874609",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb",
  "org.scalablytyped" %%% "superagent" % "4.1-dt-20220125Z-54cad4",
  "org.scalablytyped" %%% "supertest" % "v2.0.1-dt-20220818Z-74b47f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
