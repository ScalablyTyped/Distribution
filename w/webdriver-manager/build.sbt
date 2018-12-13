organization := "org.scalablytyped"
name := "webdriver-manager"
version := "12.1.0-37cd14"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "adm-zip" % "v0.4.4-dt-20180910Z-32a12a",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181018Z-ed6428",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180910Z-4e4989",
  "org.scalablytyped" %%% "chalk" % "2.4.1-76fe8f",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180910Z-f388aa",
  "org.scalablytyped" %%% "del" % "3.0-dt-20180910Z-344392",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180910Z-404a30",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181120Z-a7959e",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180927Z-b7b8a8",
  "org.scalablytyped" %%% "ini" % "v1.3.3-dt-20181129Z-251b37",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180910Z-45414c",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180910Z-aae1f0",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181213Z-bd3349",
  "org.scalablytyped" %%% "q" % "1.5-dt-20181206Z-a3f1d8",
  "org.scalablytyped" %%% "request" % "2.48-dt-20181105Z-0007d0",
  "org.scalablytyped" %%% "rimraf" % "2.0-dt-20180910Z-664e5f",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180910Z-90d6c1",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180910Z-d7a900",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20181104Z-ecb515",
  "org.scalablytyped" %%% "xml2js" % "0.4-dt-20180910Z-e8c452")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        