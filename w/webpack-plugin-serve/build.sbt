organization := "org.scalablytyped"
name := "webpack-plugin-serve"
version := "0.10-dt-20190506Z-50b488"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-7abcc9",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-a7db04",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-8ff114",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-090bd5",
  "org.scalablytyped" %%% "connect-history-api-fallback" % "1.3-dt-20190819Z-392c16",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20190916Z-980c44",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190819Z-915bef",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190819Z-48acfb",
  "org.scalablytyped" %%% "fast-glob" % "3.0.4-1e2984",
  "org.scalablytyped" %%% "http-proxy" % "1.17-dt-20190301Z-fd3513",
  "org.scalablytyped" %%% "http-proxy-middleware" % "0.19-dt-20190819Z-934d4a",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-9360b6",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20190701Z-ac5534",
  "org.scalablytyped" %%% "koa-compress" % "v2.x-dt-20190326Z-870700",
  "org.scalablytyped" %%% "koa-send" % "4.1-dt-20190218Z-0f85ce",
  "org.scalablytyped" %%% "koa-static" % "4.0-dt-20190207Z-d733c5",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-612693",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190911Z-da4655",
  "org.scalablytyped" %%% "nodelib__fs_dot_scandir" % "2.1.1-b87dcd",
  "org.scalablytyped" %%% "nodelib__fs_dot_stat" % "2.0.1-448965",
  "org.scalablytyped" %%% "nodelib__fs_dot_walk" % "1.2.2-80b036",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-db4fa8",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-4181d6",
  "org.scalablytyped" %%% "source-list-map" % "v0.1.6-dt-20190322Z-afc896",
  "org.scalablytyped" %%% "source-map" % "0.7.3-bb5048",
  "org.scalablytyped" %%% "std" % "3.6-c16502",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-230399",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-e01dc2",
  "org.scalablytyped" %%% "webpack" % "4.39-dt-20190825Z-f03e8e",
  "org.scalablytyped" %%% "webpack-sources" % "0.1-dt-20180625Z-4ea273")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        