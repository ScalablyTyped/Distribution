organization := "com.scalablytyped"
name := "tslint"
version := "5.11.0-9921f8"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181102Z-d346e3",
  "com.scalablytyped" %%% "babel-code-frame" % "6.20-dt-20181102Z-747818",
  "com.scalablytyped" %%% "builtin-modules" % "2.0-dt-20181102Z-10a255",
  "com.scalablytyped" %%% "chalk" % "2.4.1-ef8d2c",
  "com.scalablytyped" %%% "color-name" % "1.1-dt-20181102Z-8ba882",
  "com.scalablytyped" %%% "commander" % "2.19.0-5a68a9",
  "com.scalablytyped" %%% "diff" % "3.5-dt-20181105Z-5885f0",
  "com.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20181102Z-6ced09",
  "com.scalablytyped" %%% "glob" % "7.1-dt-20181102Z-ea59e6",
  "com.scalablytyped" %%% "js-yaml" % "3.11-dt-20181102Z-0a1057",
  "com.scalablytyped" %%% "minimatch" % "3.0-dt-20181102Z-8447c6",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181116Z-806eaf",
  "com.scalablytyped" %%% "resolve" % "0.0-unknown-dt-20181102Z-28ea11",
  "com.scalablytyped" %%% "semver" % "5.5-dt-20181102Z-92c73a",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "com.scalablytyped" %%% "supports-color" % "5.3-dt-20181102Z-2c93a8",
  "com.scalablytyped" %%% "tslib" % "1.9.3-89a8f4",
  "com.scalablytyped" %%% "tsutils" % "2.29.0-7b895c",
  "com.scalablytyped" %%% "typescript" % "3.1.6-0ff591",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        