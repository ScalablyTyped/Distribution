organization := "org.scalablytyped"
name := "swagger-node-runner"
version := "0.6-dt-20190212Z-fbc0b7"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-fa541b",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181116Z-52dbd1",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20190311Z-ab9ff4",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190219Z-4b9922",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-ec1e73",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190604Z-d0e78b",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190606Z-95eecb",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20190426Z-2533bb",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-24f192",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190414Z-3845f7",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-7c60c5",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-166c9f",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20190322Z-698145",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190703Z-0260d9",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20190322Z-ad34dd",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-eab0d2",
  "org.scalablytyped" %%% "restify" % "7.2-dt-20190528Z-689ee0",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-32f9e0",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-9b4ba2",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20181121Z-b13e4c",
  "org.scalablytyped" %%% "std" % "3.5-d4a303",
  "org.scalablytyped" %%% "swagger-schema-official" % "2.0-dt-20190701Z-911e76")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        