organization := "org.scalablytyped"
name := "webpack-plugin-serve"
version := "0.10-dt-20190506Z-974732"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-56c6ef",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-fb2478",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-51a501",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-0a8905",
  "org.scalablytyped" %%% "connect-history-api-fallback" % "1.3-dt-20190326Z-175a7a",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20190420Z-997b62",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190604Z-e17ce1",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190606Z-1f4573",
  "org.scalablytyped" %%% "fast-glob" % "2.2.7-d8cacc",
  "org.scalablytyped" %%% "http-proxy" % "1.17-dt-20190301Z-77d486",
  "org.scalablytyped" %%% "http-proxy-middleware" % "0.19-dt-20190114Z-96709d",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-b91680",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20190322Z-e2ea5c",
  "org.scalablytyped" %%% "koa-compose" % "3.2-dt-20190522Z-e38788",
  "org.scalablytyped" %%% "koa-compress" % "v2.x-dt-20190326Z-6af3ac",
  "org.scalablytyped" %%% "koa-send" % "4.1-dt-20190218Z-3296b4",
  "org.scalablytyped" %%% "koa-static" % "4.0-dt-20190207Z-87abfb",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-49fefe",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190606Z-b7fe68",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-374f35",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-3a476c",
  "org.scalablytyped" %%% "source-map" % "0.7.3-04ee27",
  "org.scalablytyped" %%% "std" % "3.5-f010ac",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-ebdc97",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-a1762e",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20190521Z-a2bd2c")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        