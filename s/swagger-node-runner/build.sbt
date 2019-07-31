organization := "org.scalablytyped"
name := "swagger-node-runner"
version := "0.6-dt-20190212Z-41120a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-81b6cc",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181116Z-31ac2c",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20190311Z-0e9eca",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190219Z-07848f",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-65363d",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190604Z-8a448f",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190717Z-d99a71",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20190426Z-da8ffb",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-f16224",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190414Z-8ac771",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-85a68c",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-cb7ee4",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20190322Z-ce07fc",
  "org.scalablytyped" %%% "node" % "12.6-dt-20190731Z-f93e3e",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20190322Z-a07bf8",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-223eff",
  "org.scalablytyped" %%% "restify" % "7.2-dt-20190716Z-758646",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-f9da0b",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-a21393",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20181121Z-24d7a5",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc",
  "org.scalablytyped" %%% "swagger-schema-official" % "2.0-dt-20190701Z-66f302")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        