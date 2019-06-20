organization := "org.scalablytyped"
name := "swagger-restify-mw"
version := "0.7-dt-20181022Z-70b074"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-f78539",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181116Z-52dbd1",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20190311Z-6b9a99",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190219Z-4b9922",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-039467",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190604Z-046e36",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190606Z-f895cb",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20190426Z-c6d9ff",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-4f51e4",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190414Z-3845f7",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-7c60c5",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-166c9f",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20190322Z-698145",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190611Z-b8909f",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20190322Z-ad34dd",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-eab0d2",
  "org.scalablytyped" %%% "restify" % "7.2-dt-20190528Z-f3e474",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-d489cc",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-502e15",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20181121Z-bb2d51",
  "org.scalablytyped" %%% "std" % "3.5-d4a303",
  "org.scalablytyped" %%% "swagger-node-runner" % "0.6-dt-20190212Z-7b2112",
  "org.scalablytyped" %%% "swagger-schema-official" % "2.0-dt-20190613Z-d9860e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        