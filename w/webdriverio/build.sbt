organization := "org.scalablytyped"
name := "webdriverio"
version := "5.7.0-d01f89"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180214Z-197130",
  "org.scalablytyped" %%% "deepmerge" % "3.2.0-065978",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-ffa40c",
  "org.scalablytyped" %%% "grapheme-splitter" % "1.0.4-805b20",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190227Z-56553a",
  "org.scalablytyped" %%% "lodash_dot_isobject" % "3.0-dt-20190214Z-eb2fa0",
  "org.scalablytyped" %%% "lodash_dot_merge" % "4.6-dt-20190214Z-7f7267",
  "org.scalablytyped" %%% "lodash_dot_zip" % "4.2-dt-20190214Z-797e1d",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-fd0a52",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190117Z-e9e8b4",
  "org.scalablytyped" %%% "serialize-error" % "2.1-dt-20180607Z-4e1c58",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-3a715e",
  "org.scalablytyped" %%% "webdriver" % "5.7.0-c72a8c")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        