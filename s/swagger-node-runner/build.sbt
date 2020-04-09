organization := "org.scalablytyped"
name := "swagger-node-runner"
version := "0.6-dt-20190212Z-9195f8"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "body-parser" % "1.19-dt-20200210Z-777753",
  "org.scalablytyped" %%% "boom" % "7.3-dt-20200226Z-efa725",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20200226Z-10683e",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190219Z-f30551",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20200226Z-26d1e9",
  "org.scalablytyped" %%% "express" % "4.17-dt-20200331Z-79bd5c",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20200323Z-88b703",
  "org.scalablytyped" %%% "formidable" % "1.0.16-dt-20200225Z-596d1b",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20200227Z-962d5a",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-6d19c9",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20200227Z-0b3433",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20191126Z-3b5426",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20200330Z-b5288f",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20200330Z-7d52fa",
  "org.scalablytyped" %%% "node" % "13.11-dt-20200402Z-9a87f0",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20200225Z-4a23e4",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20200225Z-e66ac9",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-6ae0c0",
  "org.scalablytyped" %%% "restify" % "8.4-dt-20200225Z-bb657f",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20200227Z-e748ee",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-59e955",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20200227Z-48dded",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "swagger-schema-official" % "2.0-dt-20200314Z-85275c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
