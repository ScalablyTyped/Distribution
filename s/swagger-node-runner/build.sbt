organization := "org.scalablytyped"
name := "swagger-node-runner"
version := "0.6-dt-20190212Z-82ba69"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "body-parser" % "1.19-dt-20200210Z-e204eb",
  "org.scalablytyped" %%% "boom" % "7.3-dt-20200226Z-e98120",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20200226Z-2bfcf6",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190219Z-e26bff",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20200226Z-677666",
  "org.scalablytyped" %%% "express" % "4.17-dt-20200409Z-704088",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20200415Z-afdfd2",
  "org.scalablytyped" %%% "formidable" % "1.0.16-dt-20200225Z-8a5756",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20200227Z-dc6d2a",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-74c478",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20200227Z-ad8611",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20191126Z-cd6086",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20200330Z-8b3e50",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20200330Z-876f6d",
  "org.scalablytyped" %%% "node" % "13.13-dt-20200417Z-f3d81d",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20200225Z-8c1d2b",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20200225Z-6c439e",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-0a8d6e",
  "org.scalablytyped" %%% "restify" % "8.4-dt-20200225Z-34ccd1",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20200227Z-c88828",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-d7c346",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20200227Z-03d70f",
  "org.scalablytyped" %%% "std" % "3.8-9b2470",
  "org.scalablytyped" %%% "swagger-schema-official" % "2.0-dt-20200314Z-024944")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
