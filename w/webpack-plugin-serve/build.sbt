organization := "org.scalablytyped"
name := "webpack-plugin-serve"
version := "0.10-dt-20190506Z-61f198"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-6d8609",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-facedf",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-2ae511",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-05f2a9",
  "org.scalablytyped" %%% "connect-history-api-fallback" % "1.3-dt-20190326Z-cf016d",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20190420Z-4e7246",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190604Z-cbb478",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190717Z-5afe6e",
  "org.scalablytyped" %%% "fast-glob" % "3.0.4-718b8c",
  "org.scalablytyped" %%% "http-proxy" % "1.17-dt-20190301Z-dd8903",
  "org.scalablytyped" %%% "http-proxy-middleware" % "0.19-dt-20190114Z-da2215",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-6f6992",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20190701Z-618a1c",
  "org.scalablytyped" %%% "koa-compress" % "v2.x-dt-20190326Z-ad6fac",
  "org.scalablytyped" %%% "koa-send" % "4.1-dt-20190218Z-b2626b",
  "org.scalablytyped" %%% "koa-static" % "4.0-dt-20190207Z-224d57",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-85a68c",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190815Z-317602",
  "org.scalablytyped" %%% "nodelib__fs_dot_scandir" % "2.1.1-ff4a27",
  "org.scalablytyped" %%% "nodelib__fs_dot_stat" % "2.0.1-91a539",
  "org.scalablytyped" %%% "nodelib__fs_dot_walk" % "1.2.2-7d497b",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-223eff",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-010b16",
  "org.scalablytyped" %%% "source-map" % "0.7.3-9427ea",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-86c6de",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-594357",
  "org.scalablytyped" %%% "webpack" % "4.32-dt-20190724Z-8f7d29")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        