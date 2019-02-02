organization := "org.scalablytyped"
name := "supertest-as-promised"
version := "2.0-dt-20180712Z-6b4d69"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181213Z-ef7d03",
  "org.scalablytyped" %%% "cookiejar" % "2.1-dt-20190116Z-ecae5a",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-8da1df",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314",
  "org.scalablytyped" %%% "superagent" % "3.8-dt-20181230Z-f20593",
  "org.scalablytyped" %%% "supertest" % "v2.0.1-dt-20181121Z-b9d9f9")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        