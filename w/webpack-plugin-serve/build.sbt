organization := "org.scalablytyped"
name := "webpack-plugin-serve"
version := "0.10-dt-20190506Z-4e2200"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-ae4183",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-44bb30",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-0f462b",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-8e708a",
  "org.scalablytyped" %%% "connect-history-api-fallback" % "1.3-dt-20190819Z-850f50",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20190420Z-2d0e0d",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190819Z-381ce5",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190819Z-aba9aa",
  "org.scalablytyped" %%% "fast-glob" % "3.0.4-c1e56f",
  "org.scalablytyped" %%% "http-proxy" % "1.17-dt-20190301Z-21c3c6",
  "org.scalablytyped" %%% "http-proxy-middleware" % "0.19-dt-20190819Z-0c5371",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-2d2be7",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20190701Z-8c12f5",
  "org.scalablytyped" %%% "koa-compress" % "v2.x-dt-20190326Z-9e5ef2",
  "org.scalablytyped" %%% "koa-send" % "4.1-dt-20190218Z-d20014",
  "org.scalablytyped" %%% "koa-static" % "4.0-dt-20190207Z-85b6d3",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-c877f7",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190815Z-2dc4df",
  "org.scalablytyped" %%% "nodelib__fs_dot_scandir" % "2.1.1-8df1d4",
  "org.scalablytyped" %%% "nodelib__fs_dot_stat" % "2.0.1-01e3d0",
  "org.scalablytyped" %%% "nodelib__fs_dot_walk" % "1.2.2-22d460",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-b87c0a",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-c4d375",
  "org.scalablytyped" %%% "source-map" % "0.7.3-20fa05",
  "org.scalablytyped" %%% "std" % "3.5-cd493c",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-8d90ab",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-a7321d",
  "org.scalablytyped" %%% "webpack" % "4.32-dt-20190817Z-06263e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        