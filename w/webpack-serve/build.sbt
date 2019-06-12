organization := "org.scalablytyped"
name := "webpack-serve"
version := "2.0-dt-20190212Z-6ccc5b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-3a4642",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-375ab8",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-f89d38",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-07b727",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20190420Z-68e524",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190604Z-47e6a1",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190606Z-ae49a5",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-a78834",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20190322Z-504ce2",
  "org.scalablytyped" %%% "koa-compose" % "3.2-dt-20190522Z-e59d91",
  "org.scalablytyped" %%% "loglevel" % "1.5-dt-20190205Z-4c8fdd",
  "org.scalablytyped" %%% "memory-fs" % "0.3.0-dt-20190322Z-282c0f",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-51fe5c",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190611Z-76ef23",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-39a594",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-c829e9",
  "org.scalablytyped" %%% "source-map" % "0.7.3-b05be9",
  "org.scalablytyped" %%% "std" % "3.5-c5d119",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-f9cdac",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-e377d2",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20190521Z-9a1e13",
  "org.scalablytyped" %%% "webpack-dev-middleware" % "2.0-dt-20180709Z-c6e449",
  "org.scalablytyped" %%% "webpack-hot-client" % "4.0-dt-20180621Z-807fd2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        