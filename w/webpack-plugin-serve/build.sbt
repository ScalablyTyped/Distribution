organization := "org.scalablytyped"
name := "webpack-plugin-serve"
version := "0.10-dt-20190506Z-4ef99c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-f538ef",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-c5c3e6",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-732eb4",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-1699d9",
  "org.scalablytyped" %%% "connect-history-api-fallback" % "1.3-dt-20190326Z-fa679d",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20190420Z-d28391",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-448e20",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190524Z-e586f1",
  "org.scalablytyped" %%% "fast-glob" % "2.2.7-a3e7d9",
  "org.scalablytyped" %%% "http-proxy" % "1.17-dt-20190301Z-0457f6",
  "org.scalablytyped" %%% "http-proxy-middleware" % "0.19-dt-20190114Z-ab7a12",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-b7c6ed",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20190322Z-965a60",
  "org.scalablytyped" %%% "koa-compose" % "3.2-dt-20190522Z-9c4bc7",
  "org.scalablytyped" %%% "koa-compress" % "v2.x-dt-20190326Z-bf7d22",
  "org.scalablytyped" %%% "koa-send" % "4.1-dt-20190218Z-bc94c1",
  "org.scalablytyped" %%% "koa-static" % "4.0-dt-20190207Z-5b94cd",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-169399",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190517Z-1fb914",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-acf35f",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-1e3fd2",
  "org.scalablytyped" %%% "source-map" % "0.7.3-c62343",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-98777a",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-32bf87",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20190521Z-034150")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        