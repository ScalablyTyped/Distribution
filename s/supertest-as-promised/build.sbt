organization := "org.scalablytyped"
name := "supertest-as-promised"
version := "2.0-dt-20200515Z-78856e"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20201028Z-8d4fd2",
  "org.scalablytyped" %%% "cookiejar" % "2.1-dt-20201014Z-ba9607",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-50d3d9",
  "org.scalablytyped" %%% "std" % "4.1-40053c",
  "org.scalablytyped" %%% "superagent" % "4.1-dt-20200825Z-1337a3",
  "org.scalablytyped" %%% "supertest" % "v2.0.1-dt-20201002Z-9fad3b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
