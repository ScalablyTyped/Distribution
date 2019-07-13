organization := "org.scalablytyped"
name := "webpack-plugin-serve"
version := "0.10-dt-20190506Z-e47277"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-461451",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-630d1b",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-9c0b17",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-4db962",
  "org.scalablytyped" %%% "connect-history-api-fallback" % "1.3-dt-20190326Z-4a5758",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20190420Z-35ffc4",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190604Z-dbaceb",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190606Z-e06e47",
  "org.scalablytyped" %%% "fast-glob" % "3.0.4-2bcc2d",
  "org.scalablytyped" %%% "http-proxy" % "1.17-dt-20190301Z-bafdb7",
  "org.scalablytyped" %%% "http-proxy-middleware" % "0.19-dt-20190114Z-2d7f2f",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-271e7b",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20190701Z-2a0caf",
  "org.scalablytyped" %%% "koa-compose" % "3.2-dt-20190522Z-1188af",
  "org.scalablytyped" %%% "koa-compress" % "v2.x-dt-20190326Z-ea08a5",
  "org.scalablytyped" %%% "koa-send" % "4.1-dt-20190218Z-7ea1c2",
  "org.scalablytyped" %%% "koa-static" % "4.0-dt-20190207Z-cc79b5",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-1c84be",
  "org.scalablytyped" %%% "node" % "12.6-dt-20190709Z-570c89",
  "org.scalablytyped" %%% "nodelib__fs_dot_scandir" % "2.1.1-643cc9",
  "org.scalablytyped" %%% "nodelib__fs_dot_stat" % "2.0.1-d834af",
  "org.scalablytyped" %%% "nodelib__fs_dot_walk" % "1.2.2-0ba4f5",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-f16918",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-5d9695",
  "org.scalablytyped" %%% "source-map" % "0.7.3-11ec74",
  "org.scalablytyped" %%% "std" % "3.5-983486",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-a00acf",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-8dc4d2",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20190712Z-d7ee38")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        