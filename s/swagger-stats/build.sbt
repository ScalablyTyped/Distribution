organization := "org.scalablytyped"
name := "swagger-stats"
version := "0.95-dt-20200211Z-a8ab0e"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "body-parser" % "1.19-dt-20200210Z-cc0ef5",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20191217Z-07dbf2",
  "org.scalablytyped" %%% "express" % "4.17-dt-20191101Z-f4e6a1",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20200121Z-868c54",
  "org.scalablytyped" %%% "hapi__boom" % "9.0.0-e6a605",
  "org.scalablytyped" %%% "hapi__catbox" % "10.2-dt-20190521Z-1fb598",
  "org.scalablytyped" %%% "hapi__hapi" % "19.0-dt-20200130Z-12293b",
  "org.scalablytyped" %%% "hapi__iron" % "6.0.0-b69be2",
  "org.scalablytyped" %%% "hapi__joi" % "16.0-dt-20200214Z-37ed18",
  "org.scalablytyped" %%% "hapi__mimos" % "4.1-dt-20190404Z-7697d4",
  "org.scalablytyped" %%% "hapi__podium" % "3.4-dt-20190404Z-b0c9c9",
  "org.scalablytyped" %%% "hapi__shot" % "4.1-dt-20190404Z-000407",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20191126Z-4fb0bc",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-963524",
  "org.scalablytyped" %%% "node" % "13.7-dt-20200211Z-d6af7e",
  "org.scalablytyped" %%% "prom-client" % "11.5.3-1ad73d",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-7c1dac",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-d83efd",
  "org.scalablytyped" %%% "std" % "3.7-1b8369")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
