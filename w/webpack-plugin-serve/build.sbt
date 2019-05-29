organization := "org.scalablytyped"
name := "webpack-plugin-serve"
version := "0.10-dt-20190506Z-44b1bb"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-1abe8c",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-c668e9",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-bfc0a3",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-468aa7",
  "org.scalablytyped" %%% "connect-history-api-fallback" % "1.3-dt-20190326Z-aecd20",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20190420Z-d8d7fe",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-c27d44",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190524Z-c3ce7d",
  "org.scalablytyped" %%% "fast-glob" % "2.2.7-14f14b",
  "org.scalablytyped" %%% "http-proxy" % "1.17-dt-20190301Z-0edfb1",
  "org.scalablytyped" %%% "http-proxy-middleware" % "0.19-dt-20190114Z-8b294e",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-18f96c",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20190322Z-43b872",
  "org.scalablytyped" %%% "koa-compose" % "3.2-dt-20190522Z-052743",
  "org.scalablytyped" %%% "koa-compress" % "v2.x-dt-20190326Z-150700",
  "org.scalablytyped" %%% "koa-send" % "4.1-dt-20190218Z-4af53b",
  "org.scalablytyped" %%% "koa-static" % "4.0-dt-20190207Z-2774ad",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-6731ec",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190528Z-17198b",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-3e1146",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-d55a89",
  "org.scalablytyped" %%% "source-map" % "0.7.3-4c9904",
  "org.scalablytyped" %%% "std" % "3.4-ef47bb",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-c234c0",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-db399f",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20190521Z-c79d12")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        