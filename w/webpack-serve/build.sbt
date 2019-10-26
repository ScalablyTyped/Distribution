organization := "org.scalablytyped"
name := "webpack-serve"
version := "2.0-dt-20190212Z-3e1b3e"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-028d87",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-7f5e7d",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-673836",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-9a66bf",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20191002Z-818708",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190819Z-534eff",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20191015Z-5bc067",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-1dd753",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20191016Z-1ebbb7",
  "org.scalablytyped" %%% "loglevel" % "1.6.4-135c7b",
  "org.scalablytyped" %%% "memory-fs" % "0.3.0-dt-20190322Z-0a4591",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-8e1e66",
  "org.scalablytyped" %%% "node" % "12.11-dt-20191024Z-c10572",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-c44ea2",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-532a00",
  "org.scalablytyped" %%% "source-list-map" % "v0.1.6-dt-20190322Z-df1e9f",
  "org.scalablytyped" %%% "source-map" % "0.7.3-54a40f",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-463316",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-2f0bcb",
  "org.scalablytyped" %%% "webpack" % "4.39-dt-20191021Z-6c5a3e",
  "org.scalablytyped" %%% "webpack-dev-middleware" % "2.0-dt-20190624Z-3eb102",
  "org.scalablytyped" %%% "webpack-hot-client" % "4.0-dt-20180621Z-bcd86e",
  "org.scalablytyped" %%% "webpack-sources" % "0.1-dt-20180625Z-0ad199")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        