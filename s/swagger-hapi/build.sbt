organization := "org.scalablytyped"
name := "swagger-hapi"
version := "0.7-dt-20181022Z-0f55c3"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-b7a897",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181116Z-1637e5",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20190311Z-0fb037",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190219Z-1b00d1",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-d1a562",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-481648",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190429Z-7ae182",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20190426Z-8b3f2f",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-0d824e",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190414Z-536314",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-7c1445",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-38d1ba",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20190322Z-ec220e",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190429Z-40b461",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20190322Z-a87603",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-565137",
  "org.scalablytyped" %%% "restify" % "7.2-dt-20190319Z-5efdb0",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-3f05df",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-04bcdd",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20181121Z-e7a72b",
  "org.scalablytyped" %%% "std" % "3.4-495f93",
  "org.scalablytyped" %%% "swagger-node-runner" % "0.6-dt-20190212Z-d91da2",
  "org.scalablytyped" %%% "swagger-schema-official" % "2.0-dt-20190220Z-68a619")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        