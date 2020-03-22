organization := "org.scalablytyped"
name := "swagger-hapi"
version := "0.7-dt-20181022Z-51503e"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "body-parser" % "1.19-dt-20200210Z-e73a63",
  "org.scalablytyped" %%% "boom" % "7.3-dt-20200226Z-efa725",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20200226Z-746b2c",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190219Z-f30551",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20200226Z-269b22",
  "org.scalablytyped" %%% "express" % "4.17-dt-20200303Z-1c1293",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20200225Z-dbe850",
  "org.scalablytyped" %%% "formidable" % "1.0.16-dt-20200225Z-a314e8",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20200227Z-339e31",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-faf6f6",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20200227Z-0b3433",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20191126Z-3b5426",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-574028",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20200225Z-327e15",
  "org.scalablytyped" %%% "node" % "13.9-dt-20200318Z-96a265",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20200225Z-4a23e4",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-6ae0c0",
  "org.scalablytyped" %%% "restify" % "8.4-dt-20200225Z-dc03f4",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20200227Z-dc6343",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-bf1934",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20200227Z-2c8a7a",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "swagger-node-runner" % "0.6-dt-20190212Z-9b5941",
  "org.scalablytyped" %%% "swagger-schema-official" % "2.0-dt-20200314Z-708e76")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
