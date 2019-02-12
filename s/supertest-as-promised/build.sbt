organization := "org.scalablytyped"
name := "supertest-as-promised"
version := "2.0-dt-20180712Z-cf8427"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181213Z-f01776",
  "org.scalablytyped" %%% "cookiejar" % "2.1-dt-20190116Z-a37fdd",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190211Z-6a64f2",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "superagent" % "3.8-dt-20181230Z-0e1b39",
  "org.scalablytyped" %%% "supertest" % "v2.0.1-dt-20181121Z-9557b2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        