organization := "org.scalablytyped"
name := "swagger-hapi"
version := "0.7-dt-20211202Z-fcf434"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "boom" % "7.3-dt-20220913Z-c2eddd",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20211202Z-3939f3",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20211202Z-d1c6af",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-6f01fe",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-c34bb1",
  "org.scalablytyped" %%% "formidable" % "2.0-dt-20220502Z-283342",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20220819Z-71fade",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20211202Z-3612b1",
  "org.scalablytyped" %%% "joi" % "17.6.0-f7916a",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-21c0d6",
  "org.scalablytyped" %%% "mime-db" % "1.43-dt-20211202Z-f3260c",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20211202Z-9aa32e",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220913Z-77cc8d",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20211202Z-156f9b",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-11838a",
  "org.scalablytyped" %%% "restify" % "8.5-dt-20220810Z-87c412",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-77d826",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20211202Z-bf1677",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20211202Z-4cf73d",
  "org.scalablytyped" %%% "std" % "4.8-958c79",
  "org.scalablytyped" %%% "swagger-node-runner" % "0.6-dt-20211202Z-5960c0",
  "org.scalablytyped" %%% "swagger-schema-official" % "2.0-dt-20211202Z-f6a5a4")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
