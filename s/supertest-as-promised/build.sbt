organization := "org.scalablytyped"
name := "supertest-as-promised"
version := "2.0-dt-20190524Z-67df1b"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190524Z-0961f2",
  "org.scalablytyped" %%% "cookiejar" % "2.1-dt-20190116Z-812829",
  "org.scalablytyped" %%% "node" % "12.7-dt-20191003Z-a35ed6",
  "org.scalablytyped" %%% "std" % "3.6-abb6d3",
  "org.scalablytyped" %%% "superagent" % "4.1-dt-20190708Z-8f497a",
  "org.scalablytyped" %%% "supertest" % "v2.0.1-dt-20190703Z-25d16d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        