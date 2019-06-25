organization := "org.scalablytyped"
name := "webpack-serve"
version := "2.0-dt-20190212Z-1c58ac"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-173e51",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-228aa6",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-d64a0e",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-a1e1e0",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20190420Z-72f657",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190604Z-cb6937",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190606Z-e7cc40",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-9b0098",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20190322Z-62e70e",
  "org.scalablytyped" %%% "koa-compose" % "3.2-dt-20190522Z-97aa3d",
  "org.scalablytyped" %%% "loglevel" % "1.6.3-123167",
  "org.scalablytyped" %%% "memory-fs" % "0.3.0-dt-20190322Z-d81a9c",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-7c60c5",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190621Z-8f9d23",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-eab0d2",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-a3667a",
  "org.scalablytyped" %%% "source-map" % "0.7.3-4aa868",
  "org.scalablytyped" %%% "std" % "3.5-d4a303",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-89a0aa",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-fae9fa",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20190624Z-8912b1",
  "org.scalablytyped" %%% "webpack-dev-middleware" % "2.0-dt-20190624Z-a73132",
  "org.scalablytyped" %%% "webpack-hot-client" % "4.0-dt-20180621Z-949be6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        