organization := "org.scalablytyped"
name := "swagger-hapi"
version := "0.7-dt-20181022Z-93a22f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-bec058",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181116Z-745bd0",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20190311Z-9948e1",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190219Z-c8b399",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-26b345",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-3cd88f",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190429Z-f7bfa3",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20190426Z-4cd1e9",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-c5fbbd",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190414Z-c4b8ce",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-169399",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-279468",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20190322Z-04bd28",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190503Z-cb8223",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20190322Z-feec7c",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-acf35f",
  "org.scalablytyped" %%% "restify" % "7.2-dt-20190506Z-70385a",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-ad1ffd",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-69072c",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20181121Z-4d105d",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2",
  "org.scalablytyped" %%% "swagger-node-runner" % "0.6-dt-20190212Z-7ca272",
  "org.scalablytyped" %%% "swagger-schema-official" % "2.0-dt-20190220Z-6c58fe")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        