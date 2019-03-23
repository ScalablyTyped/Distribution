organization := "org.scalablytyped"
name := "tslint"
version := "5.14.0-1d5226"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20190322Z-052e82",
  "org.scalablytyped" %%% "babel-code-frame" % "6.20-dt-20190212Z-856656",
  "org.scalablytyped" %%% "builtin-modules" % "2.0-dt-20180214Z-2120f2",
  "org.scalablytyped" %%% "chalk" % "2.4.2-273699",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20190212Z-f1b784",
  "org.scalablytyped" %%% "commander" % "2.19.0-d01a66",
  "org.scalablytyped" %%% "diff" % "4.0-dt-20190322Z-61146a",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20190322Z-1f537b",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-ab02fa",
  "org.scalablytyped" %%% "js-yaml" % "3.12-dt-20190118Z-0397ba",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-0a2b2c",
  "org.scalablytyped" %%% "mkdirp" % "0.5-dt-20180214Z-359637",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190322Z-28a0c1",
  "org.scalablytyped" %%% "resolve" % "0.0-unknown-dt-20190322Z-e15b88",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-cc5b51",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-155129",
  "org.scalablytyped" %%% "tslib" % "1.9.3-28a6ab",
  "org.scalablytyped" %%% "tsutils" % "2.29.0-823ec1",
  "org.scalablytyped" %%% "typescript" % "3.3.4000-09c87f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        