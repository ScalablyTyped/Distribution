organization := "org.scalablytyped"
name := "swagger-restify-mw"
version := "0.7-dt-20181022Z-1fac8d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-9371e4",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181116Z-745bd0",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20190311Z-4b420d",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190219Z-629aad",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-d00fa7",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-b7b8c5",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190429Z-f78ef5",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20190426Z-99988e",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-eaadc6",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190414Z-c4b8ce",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-169399",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-279468",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20190322Z-04bd28",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190517Z-07594f",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20190322Z-feec7c",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-acf35f",
  "org.scalablytyped" %%% "restify" % "7.2-dt-20190506Z-8c002d",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-58ff5f",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-a50041",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20181121Z-be2294",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2",
  "org.scalablytyped" %%% "swagger-node-runner" % "0.6-dt-20190212Z-71fa6f",
  "org.scalablytyped" %%% "swagger-schema-official" % "2.0-dt-20190520Z-ebeefb")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        