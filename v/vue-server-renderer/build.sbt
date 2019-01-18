organization := "org.scalablytyped"
name := "vue-server-renderer"
version := "2.5.22-525271"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181017Z-ec2bbb",
  "org.scalablytyped" %%% "chalk" % "2.4.2-aa77e5",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180214Z-786ea5",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180721Z-433270",
  "org.scalablytyped" %%% "hash-sum" % "1.0-dt-20180822Z-63bb88",
  "org.scalablytyped" %%% "he" % "v1.1.1-dt-20180507Z-62eec6",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190116Z-c48db4",
  "org.scalablytyped" %%% "lodash_dot_template" % "4.4-dt-20180723Z-2112a7",
  "org.scalablytyped" %%% "lodash_dot_uniq" % "4.5-dt-20180723Z-50b6ec",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-7438ae",
  "org.scalablytyped" %%% "resolve" % "0.0-unknown-dt-20180507Z-4089ba",
  "org.scalablytyped" %%% "serialize-javascript" % "1.5-dt-20181015Z-3a9e0a",
  "org.scalablytyped" %%% "source-map" % "0.7.3-1d8315",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-394486",
  "org.scalablytyped" %%% "vue" % "2.5.22-e8dce6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        