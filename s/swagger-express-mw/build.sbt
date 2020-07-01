organization := "org.scalablytyped"
name := "swagger-express-mw"
version := "0.7-dt-20181022Z-f11c1d"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "body-parser" % "1.19-dt-20200210Z-8ef17f",
  "org.scalablytyped" %%% "boom" % "7.3-dt-20200515Z-9f2b58",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20200515Z-22b1fb",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20200515Z-7b1f50",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20200515Z-72dac4",
  "org.scalablytyped" %%% "express" % "4.17-dt-20200515Z-d9cc4e",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20200624Z-cd1cc0",
  "org.scalablytyped" %%% "formidable" % "1.0.16-dt-20200522Z-b7dfd4",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20200515Z-2eaaf3",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20200515Z-3f625a",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20200515Z-c964b8",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20200515Z-a16f63",
  "org.scalablytyped" %%% "mime-db" % "1.43-dt-20200424Z-5778e6",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20200515Z-031497",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200624Z-2fcd45",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20200515Z-c7adf5",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20200519Z-7b3798",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-c5e2e8",
  "org.scalablytyped" %%% "restify" % "8.4-dt-20200515Z-92a9c7",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20200519Z-9b0303",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20200515Z-656982",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20200227Z-690ebc",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8",
  "org.scalablytyped" %%% "swagger-node-runner" % "0.6-dt-20190212Z-51b08c",
  "org.scalablytyped" %%% "swagger-schema-official" % "2.0-dt-20200515Z-9979de")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
