organization := "org.scalablytyped"
name := "supertest-as-promised"
version := "2.0-dt-20190524Z-4678bd"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190524Z-183d02",
  "org.scalablytyped" %%% "cookiejar" % "2.1-dt-20190116Z-4a3558",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190911Z-da4655",
  "org.scalablytyped" %%% "std" % "3.6-c16502",
  "org.scalablytyped" %%% "superagent" % "4.1-dt-20190708Z-def34d",
  "org.scalablytyped" %%% "supertest" % "v2.0.1-dt-20190703Z-0b40d2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        