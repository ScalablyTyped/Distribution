organization := "org.scalablytyped"
name := "webpack-dev-server"
version := "3.1-dt-20190524Z-0b1199"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-228aa6",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-fa541b",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-ec1e73",
  "org.scalablytyped" %%% "connect-history-api-fallback" % "1.3-dt-20190326Z-02d5aa",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190604Z-d0e78b",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190606Z-95eecb",
  "org.scalablytyped" %%% "http-proxy" % "1.17-dt-20190301Z-ddf16d",
  "org.scalablytyped" %%% "http-proxy-middleware" % "0.19-dt-20190114Z-d07c2b",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-7c60c5",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190703Z-0260d9",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-eab0d2",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-32f9e0",
  "org.scalablytyped" %%% "source-map" % "0.7.3-4aa868",
  "org.scalablytyped" %%% "std" % "3.5-d4a303",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-89a0aa",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-fae9fa",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20190624Z-e61854")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        