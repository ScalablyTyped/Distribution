organization := "org.scalablytyped"
name := "swagger-express-mw"
version := "0.7-dt-20211202Z-3b900d"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "boom" % "7.3-dt-20220913Z-f2e8e0",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20211202Z-f029c2",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20211202Z-24c331",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-7a82fe",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-87e3cc",
  "org.scalablytyped" %%% "formidable" % "2.0-dt-20220502Z-a85962",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20220819Z-068cba",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20211202Z-121c0e",
  "org.scalablytyped" %%% "joi" % "17.6.4-77dbda",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-3b1911",
  "org.scalablytyped" %%% "mime-db" % "1.43-dt-20211202Z-0ac956",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20211202Z-aefc2e",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221026Z-107efe",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20211202Z-62aa88",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-33ed42",
  "org.scalablytyped" %%% "restify" % "8.5-dt-20220810Z-600416",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-5e7139",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20211202Z-c0bf59",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20211202Z-ca2cab",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "swagger-node-runner" % "0.6-dt-20211202Z-061468",
  "org.scalablytyped" %%% "swagger-schema-official" % "2.0-dt-20211202Z-feb459")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
