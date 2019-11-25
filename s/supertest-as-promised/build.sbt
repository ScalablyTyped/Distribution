organization := "org.scalablytyped"
name := "supertest-as-promised"
version := "2.0-dt-20190524Z-7f967a"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20191111Z-104ef4",
  "org.scalablytyped" %%% "cookiejar" % "2.1-dt-20190116Z-650089",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191123Z-382692",
  "org.scalablytyped" %%% "std" % "3.7-1d724d",
  "org.scalablytyped" %%% "superagent" % "4.1-dt-20191028Z-eabbad",
  "org.scalablytyped" %%% "supertest" % "v2.0.1-dt-20190703Z-abba07")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        