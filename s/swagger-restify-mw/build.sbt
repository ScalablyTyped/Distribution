organization := "org.scalablytyped"
name := "swagger-restify-mw"
version := "0.7-dt-20211202Z-d5d39c"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "boom" % "7.3-dt-20220913Z-bca80e",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20211202Z-7d8e65",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20211202Z-499ddc",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-eec5d4",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-693358",
  "org.scalablytyped" %%% "formidable" % "2.0-dt-20220502Z-91e0b8",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20220819Z-0f4cd4",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20211202Z-5cbb78",
  "org.scalablytyped" %%% "joi" % "17.6.4-bd3b75",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-9884c6",
  "org.scalablytyped" %%% "mime-db" % "1.43-dt-20211202Z-01eaa7",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20211202Z-da5598",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221020Z-d73de4",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20211202Z-1cc53d",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-76627f",
  "org.scalablytyped" %%% "restify" % "8.5-dt-20220810Z-f29870",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-91f487",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20211202Z-f76009",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20211202Z-6fc6ee",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "swagger-node-runner" % "0.6-dt-20211202Z-210ee7",
  "org.scalablytyped" %%% "swagger-schema-official" % "2.0-dt-20211202Z-4b5a2c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
