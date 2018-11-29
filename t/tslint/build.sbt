organization := "com.scalablytyped"
name := "tslint"
version := "5.11.0-d7fa21"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181018Z-8b01ce",
  "com.scalablytyped" %%% "babel-code-frame" % "6.20-dt-20180910Z-48f35f",
  "com.scalablytyped" %%% "builtin-modules" % "2.0-dt-20180910Z-4f3dba",
  "com.scalablytyped" %%% "chalk" % "2.4.1-557431",
  "com.scalablytyped" %%% "color-name" % "1.1-dt-20180910Z-20e4ae",
  "com.scalablytyped" %%% "commander" % "2.19.0-3aaacc",
  "com.scalablytyped" %%% "diff" % "3.5-dt-20181105Z-0d6c56",
  "com.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180910Z-450016",
  "com.scalablytyped" %%% "glob" % "7.1-dt-20180927Z-8a7f1f",
  "com.scalablytyped" %%% "js-yaml" % "3.11-dt-20180910Z-2da08f",
  "com.scalablytyped" %%% "minimatch" % "3.0-dt-20180910Z-5ec0b9",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181129Z-9f7a18",
  "com.scalablytyped" %%% "resolve" % "0.0-unknown-dt-20180910Z-a05246",
  "com.scalablytyped" %%% "semver" % "5.5-dt-20180910Z-b64c1e",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "com.scalablytyped" %%% "supports-color" % "5.3-dt-20180910Z-a10740",
  "com.scalablytyped" %%% "tslib" % "1.9.3-9baf35",
  "com.scalablytyped" %%% "tsutils" % "2.29.0-91d744",
  "com.scalablytyped" %%% "typescript" % "3.2.1-5cd657",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        