organization := "org.scalablytyped"
name := "tslint"
version := "5.12.1-e5c0d1"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181017Z-ec2bbb",
  "org.scalablytyped" %%% "babel-code-frame" % "6.20-dt-20180214Z-7f4f95",
  "org.scalablytyped" %%% "builtin-modules" % "2.0-dt-20180214Z-5bd474",
  "org.scalablytyped" %%% "chalk" % "2.4.2-aa77e5",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180214Z-786ea5",
  "org.scalablytyped" %%% "commander" % "2.19.0-012a2c",
  "org.scalablytyped" %%% "diff" % "3.5-dt-20181102Z-3266eb",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180721Z-433270",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-0b7a31",
  "org.scalablytyped" %%% "js-yaml" % "3.12-dt-20190118Z-8bc5c9",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-db2a02",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-7438ae",
  "org.scalablytyped" %%% "resolve" % "0.0-unknown-dt-20180507Z-4089ba",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-d66e0c",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-394486",
  "org.scalablytyped" %%% "tslib" % "1.9.3-688770",
  "org.scalablytyped" %%% "tsutils" % "2.29.0-9e4ceb",
  "org.scalablytyped" %%% "typescript" % "3.2.4-3dde35")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        