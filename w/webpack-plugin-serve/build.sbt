organization := "org.scalablytyped"
name := "webpack-plugin-serve"
version := "0.10-dt-20190506Z-14daa7"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-125faf",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-facedf",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-d89a50",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-ee50f3",
  "org.scalablytyped" %%% "connect-history-api-fallback" % "1.3-dt-20190326Z-efdc70",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20190420Z-5e3ca4",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190604Z-083460",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190717Z-df4cf9",
  "org.scalablytyped" %%% "fast-glob" % "3.0.4-bc60d6",
  "org.scalablytyped" %%% "http-proxy" % "1.17-dt-20190301Z-582b74",
  "org.scalablytyped" %%% "http-proxy-middleware" % "0.19-dt-20190114Z-797350",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-6f6992",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20190701Z-154b1e",
  "org.scalablytyped" %%% "koa-compress" % "v2.x-dt-20190326Z-58ac92",
  "org.scalablytyped" %%% "koa-send" % "4.1-dt-20190218Z-09328a",
  "org.scalablytyped" %%% "koa-static" % "4.0-dt-20190207Z-92740c",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-85a68c",
  "org.scalablytyped" %%% "node" % "12.6-dt-20190717Z-f93e3e",
  "org.scalablytyped" %%% "nodelib__fs_dot_scandir" % "2.1.1-e888f5",
  "org.scalablytyped" %%% "nodelib__fs_dot_stat" % "2.0.1-b18479",
  "org.scalablytyped" %%% "nodelib__fs_dot_walk" % "1.2.2-0aa4a9",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-223eff",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-00865d",
  "org.scalablytyped" %%% "source-map" % "0.7.3-9427ea",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-86c6de",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-594357",
  "org.scalablytyped" %%% "webpack" % "4.32-dt-20190724Z-a1e17d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        