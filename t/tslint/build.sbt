organization := "org.scalablytyped"
name := "tslint"
version := "5.15.0-379b94"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20190322Z-d84c1e",
  "org.scalablytyped" %%% "babel-code-frame" % "6.20-dt-20190212Z-68f577",
  "org.scalablytyped" %%% "builtin-modules" % "2.0-dt-20180214Z-483c07",
  "org.scalablytyped" %%% "chalk" % "2.4.2-ca1e30",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20190212Z-5a34a6",
  "org.scalablytyped" %%% "commander" % "2.20.0-8f0f6f",
  "org.scalablytyped" %%% "diff" % "4.0-dt-20190322Z-05edd1",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20190322Z-faeaa3",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-ce8e08",
  "org.scalablytyped" %%% "js-yaml" % "3.12-dt-20190402Z-168e26",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-e6c927",
  "org.scalablytyped" %%% "mkdirp" % "0.5-dt-20180214Z-6520aa",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190330Z-7c1cfd",
  "org.scalablytyped" %%% "resolve" % "0.0-unknown-dt-20190322Z-90adb9",
  "org.scalablytyped" %%% "semver" % "6.0-dt-20190330Z-1b8b1f",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-1b70da",
  "org.scalablytyped" %%% "tslib" % "1.9.3-446b32",
  "org.scalablytyped" %%% "tsutils" % "2.29.0-d5afaa",
  "org.scalablytyped" %%% "typescript" % "3.4.1-a42773")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        