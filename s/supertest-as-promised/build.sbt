organization := "org.scalablytyped"
name := "supertest-as-promised"
version := "2.0-dt-20190524Z-f6ac7f"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190524Z-0c9c39",
  "org.scalablytyped" %%% "cookiejar" % "2.1-dt-20190116Z-c490dc",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190820Z-2dc4df",
  "org.scalablytyped" %%% "std" % "3.5-cd493c",
  "org.scalablytyped" %%% "superagent" % "4.1-dt-20190708Z-f097c9",
  "org.scalablytyped" %%% "supertest" % "v2.0.1-dt-20190703Z-3c9901")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        