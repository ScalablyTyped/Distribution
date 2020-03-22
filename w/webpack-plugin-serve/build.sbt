organization := "org.scalablytyped"
name := "webpack-plugin-serve"
version := "0.10-dt-20190506Z-341e8d"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-6c56fa",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-d40bf1",
  "org.scalablytyped" %%% "body-parser" % "1.19-dt-20200210Z-c42858",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20191217Z-058a79",
  "org.scalablytyped" %%% "connect-history-api-fallback" % "1.3-dt-20190819Z-53e990",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20191002Z-55299d",
  "org.scalablytyped" %%% "express" % "4.17-dt-20191101Z-641541",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20200121Z-e6811a",
  "org.scalablytyped" %%% "fast-glob" % "3.2.2-f9a303",
  "org.scalablytyped" %%% "http-proxy" % "1.17-dt-20200109Z-efad27",
  "org.scalablytyped" %%% "http-proxy-middleware" % "0.19-dt-20190819Z-d992d6",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20191226Z-c8bdc7",
  "org.scalablytyped" %%% "koa" % "2.11.0-dt-20200211Z-a5bb51",
  "org.scalablytyped" %%% "koa-compress" % "v2.x-dt-20190326Z-ff82f9",
  "org.scalablytyped" %%% "koa-send" % "4.1-dt-20190218Z-ff62cd",
  "org.scalablytyped" %%% "koa-static" % "4.0-dt-20190207Z-adb3a8",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20191126Z-3b5426",
  "org.scalablytyped" %%% "node" % "13.7-dt-20200211Z-b30bde",
  "org.scalablytyped" %%% "nodelib__fs_dot_scandir" % "2.1.3-0c9f4b",
  "org.scalablytyped" %%% "nodelib__fs_dot_stat" % "2.0.3-50d79d",
  "org.scalablytyped" %%% "nodelib__fs_dot_walk" % "1.2.4-7563ce",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-6ae0c0",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-28020e",
  "org.scalablytyped" %%% "source-list-map" % "v0.1.6-dt-20190322Z-4dbc49",
  "org.scalablytyped" %%% "source-map" % "0.7.3-020e14",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20200111Z-acd615",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-1b173b",
  "org.scalablytyped" %%% "webpack" % "4.41-dt-20200209Z-2b8189",
  "org.scalablytyped" %%% "webpack-sources" % "0.1-dt-20200116Z-452939")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
