organization := "org.scalablytyped"
name := "webdriverio"
version := "5.7.6-fb0f97"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20190311Z-bfb77c",
  "org.scalablytyped" %%% "deepmerge" % "3.2.0-76b51b",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-7e85a9",
  "org.scalablytyped" %%% "grapheme-splitter" % "1.0.4-dabbdf",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190311Z-7a74e5",
  "org.scalablytyped" %%% "lodash_dot_isobject" % "3.0-dt-20190214Z-55274c",
  "org.scalablytyped" %%% "lodash_dot_merge" % "4.6-dt-20190214Z-ce48fa",
  "org.scalablytyped" %%% "lodash_dot_zip" % "4.2-dt-20190214Z-9b28cd",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190325Z-000e7b",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190117Z-b714b2",
  "org.scalablytyped" %%% "serialize-error" % "2.1-dt-20180607Z-b9a87d",
  "org.scalablytyped" %%% "std" % "3.3-14e863",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-a689e5",
  "org.scalablytyped" %%% "webdriver" % "5.7.6-d5baf5")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        