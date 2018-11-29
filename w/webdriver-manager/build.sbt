organization := "com.scalablytyped"
name := "webdriver-manager"
version := "12.1.0-0978fd"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "adm-zip" % "v0.4.4-dt-20180910Z-c86209",
  "com.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181018Z-8b01ce",
  "com.scalablytyped" %%% "caseless" % "0.12-dt-20180910Z-2bf221",
  "com.scalablytyped" %%% "chalk" % "2.4.1-557431",
  "com.scalablytyped" %%% "color-name" % "1.1-dt-20180910Z-20e4ae",
  "com.scalablytyped" %%% "del" % "3.0-dt-20180910Z-96b0a7",
  "com.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180910Z-450016",
  "com.scalablytyped" %%% "form-data" % "2.2-dt-20181120Z-b1edcb",
  "com.scalablytyped" %%% "glob" % "7.1-dt-20180927Z-8a7f1f",
  "com.scalablytyped" %%% "ini" % "v1.3.3-dt-20181129Z-b9b7a3",
  "com.scalablytyped" %%% "minimatch" % "3.0-dt-20180910Z-5ec0b9",
  "com.scalablytyped" %%% "minimist" % "1.2.0-dt-20180910Z-a475cc",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181129Z-9f7a18",
  "com.scalablytyped" %%% "q" % "1.5-dt-20180915Z-726082",
  "com.scalablytyped" %%% "request" % "2.48-dt-20181105Z-fa2110",
  "com.scalablytyped" %%% "rimraf" % "2.0-dt-20180910Z-9d04f7",
  "com.scalablytyped" %%% "semver" % "5.5-dt-20180910Z-b64c1e",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "com.scalablytyped" %%% "supports-color" % "5.3-dt-20180910Z-a10740",
  "com.scalablytyped" %%% "tough-cookie" % "2.3-dt-20181104Z-65a037",
  "com.scalablytyped" %%% "xml2js" % "0.4-dt-20180910Z-dc6ed1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        