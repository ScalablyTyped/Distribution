organization := "org.scalablytyped"
name := "supertest-as-promised"
version := "2.0-dt-20200515Z-121859"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20201028Z-86bb8c",
  "org.scalablytyped" %%% "cookiejar" % "2.1-dt-20201014Z-85cccd",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-814aa8",
  "org.scalablytyped" %%% "std" % "4.1-044efb",
  "org.scalablytyped" %%% "superagent" % "4.1-dt-20200825Z-5c14e7",
  "org.scalablytyped" %%% "supertest" % "v2.0.1-dt-20201002Z-f51f5b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
