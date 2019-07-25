organization := "org.scalablytyped"
name := "webpack-serve"
version := "2.0-dt-20190212Z-2e08a4"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-af06ea",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-630d1b",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-9c543c",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-e1c7d7",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20190420Z-ffdd83",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190604Z-e6cc14",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190717Z-2e57f1",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-271e7b",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20190701Z-d2b259",
  "org.scalablytyped" %%% "koa-compose" % "3.2-dt-20190522Z-1188af",
  "org.scalablytyped" %%% "loglevel" % "1.6.3-35f60e",
  "org.scalablytyped" %%% "memory-fs" % "0.3.0-dt-20190322Z-416e43",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-1c84be",
  "org.scalablytyped" %%% "node" % "12.6-dt-20190717Z-e46800",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-f16918",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-43ad97",
  "org.scalablytyped" %%% "source-map" % "0.7.3-11ec74",
  "org.scalablytyped" %%% "std" % "3.5-983486",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-a00acf",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-8dc4d2",
  "org.scalablytyped" %%% "webpack" % "4.32-dt-20190724Z-931598",
  "org.scalablytyped" %%% "webpack-dev-middleware" % "2.0-dt-20190624Z-d33c0a",
  "org.scalablytyped" %%% "webpack-hot-client" % "4.0-dt-20180621Z-a0553e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        