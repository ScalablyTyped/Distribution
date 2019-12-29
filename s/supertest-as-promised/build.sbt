organization := "org.scalablytyped"
name := "supertest-as-promised"
version := "2.0-dt-20190524Z-5c26b5"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20191111Z-21097f",
  "org.scalablytyped" %%% "cookiejar" % "2.1-dt-20190116Z-12f277",
  "org.scalablytyped" %%% "node" % "13.1-dt-20191226Z-155d58",
  "org.scalablytyped" %%% "std" % "3.7-953338",
  "org.scalablytyped" %%% "superagent" % "4.1-dt-20191028Z-d3638f",
  "org.scalablytyped" %%% "supertest" % "v2.0.1-dt-20190703Z-251e97")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        