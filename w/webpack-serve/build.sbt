organization := "org.scalablytyped"
name := "webpack-serve"
version := "2.0-dt-20190212Z-6ae3bc"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-7c16b9",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-562662",
  "org.scalablytyped" %%% "body-parser" % "1.19-dt-20200210Z-cc0ef5",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20191217Z-07dbf2",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20191002Z-d60826",
  "org.scalablytyped" %%% "express" % "4.17-dt-20191101Z-f4e6a1",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20200121Z-868c54",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20191226Z-ef55d8",
  "org.scalablytyped" %%% "koa" % "2.11.0-dt-20200211Z-010306",
  "org.scalablytyped" %%% "loglevel" % "1.6.7-145153",
  "org.scalablytyped" %%% "memory-fs" % "0.3.0-dt-20191126Z-43811d",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20191126Z-4fb0bc",
  "org.scalablytyped" %%% "node" % "13.7-dt-20200211Z-d6af7e",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-7c1dac",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-d83efd",
  "org.scalablytyped" %%% "source-list-map" % "v0.1.6-dt-20190322Z-a63dfc",
  "org.scalablytyped" %%% "source-map" % "0.7.3-4d8ff1",
  "org.scalablytyped" %%% "std" % "3.7-1b8369",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20200111Z-934b96",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-ed6d57",
  "org.scalablytyped" %%% "webpack" % "4.41-dt-20200209Z-7b3b5d",
  "org.scalablytyped" %%% "webpack-dev-middleware" % "2.0-dt-20190624Z-90013c",
  "org.scalablytyped" %%% "webpack-hot-client" % "4.0-dt-20180621Z-73b796",
  "org.scalablytyped" %%% "webpack-sources" % "0.1-dt-20200116Z-120b1c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
