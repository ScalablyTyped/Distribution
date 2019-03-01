organization := "org.scalablytyped"
name := "webdriverio"
version := "5.6.4-3894ca"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180214Z-708eba",
  "org.scalablytyped" %%% "deepmerge" % "3.2.0-2ccfe4",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-41ab3d",
  "org.scalablytyped" %%% "grapheme-splitter" % "1.0.4-2e0768",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190212Z-f3a537",
  "org.scalablytyped" %%% "lodash_dot_isobject" % "3.0-dt-20190212Z-508843",
  "org.scalablytyped" %%% "lodash_dot_merge" % "4.6-dt-20190212Z-638a38",
  "org.scalablytyped" %%% "lodash_dot_zip" % "4.2-dt-20190212Z-5ffd06",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-99335f",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190117Z-c50522",
  "org.scalablytyped" %%% "serialize-error" % "2.1-dt-20180607Z-cc9067",
  "org.scalablytyped" %%% "std" % "3.3-6e4388",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-62e3dd",
  "org.scalablytyped" %%% "webdriver" % "5.6.4-02edb4")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        