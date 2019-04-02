organization := "org.scalablytyped"
name := "webdriverio"
version := "5.7.8-27763d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20190311Z-67548d",
  "org.scalablytyped" %%% "deepmerge" % "3.2.0-a1baa5",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-57c0e7",
  "org.scalablytyped" %%% "grapheme-splitter" % "1.0.4-781183",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190329Z-69a948",
  "org.scalablytyped" %%% "lodash_dot_isobject" % "3.0-dt-20190214Z-b35ad3",
  "org.scalablytyped" %%% "lodash_dot_isplainobject" % "4.0-dt-20190214Z-cd3897",
  "org.scalablytyped" %%% "lodash_dot_merge" % "4.6-dt-20190214Z-3ec133",
  "org.scalablytyped" %%% "lodash_dot_zip" % "4.2-dt-20190214Z-efb843",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190330Z-7c1cfd",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190117Z-ca6c55",
  "org.scalablytyped" %%% "serialize-error" % "2.1-dt-20180607Z-d5b5f1",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-972cef",
  "org.scalablytyped" %%% "webdriver" % "5.7.8-ba50c3")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        