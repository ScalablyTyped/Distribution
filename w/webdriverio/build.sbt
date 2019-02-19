organization := "org.scalablytyped"
name := "webdriverio"
version := "5.4.19-5bc5e0"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180214Z-bde245",
  "org.scalablytyped" %%% "deepmerge" % "3.2.0-30afb2",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-0cec79",
  "org.scalablytyped" %%% "grapheme-splitter" % "1.0.4-a19348",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190212Z-cf3a73",
  "org.scalablytyped" %%% "lodash_dot_merge" % "4.6-dt-20190212Z-649a6d",
  "org.scalablytyped" %%% "lodash_dot_zip" % "4.2-dt-20190212Z-90cef3",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190213Z-0d969a",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190117Z-7fce32",
  "org.scalablytyped" %%% "serialize-error" % "2.1-dt-20180607Z-007aa4",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-9af261",
  "org.scalablytyped" %%% "webdriver" % "5.4.18-e009f2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        