organization := "org.scalablytyped"
name := "webpack-dev-server"
version := "3.1-dt-20190129Z-c03c2b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-a09216",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-b8fac3",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-da964c",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-bce0b9",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190122Z-759423",
  "org.scalablytyped" %%% "http-proxy" % "1.16-dt-20180514Z-16c163",
  "org.scalablytyped" %%% "http-proxy-middleware" % "0.19-dt-20190114Z-61594d",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-54d3f4",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190212Z-0d969a",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-c7c39d",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-e720f7",
  "org.scalablytyped" %%% "source-map" % "0.7.3-cdf339",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20180713Z-2fd0f1",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-876284",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20190116Z-7be74f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        