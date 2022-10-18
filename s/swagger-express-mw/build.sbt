organization := "org.scalablytyped"
name := "swagger-express-mw"
version := "0.7-dt-20211202Z-c018b8"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "boom" % "7.3-dt-20220913Z-bca80e",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20211202Z-c20552",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20211202Z-499ddc",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-d74acb",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-06d29e",
  "org.scalablytyped" %%% "formidable" % "2.0-dt-20220502Z-6b5a0a",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20220819Z-9067f2",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20211202Z-65dde9",
  "org.scalablytyped" %%% "joi" % "17.6.3-651f50",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-9884c6",
  "org.scalablytyped" %%% "mime-db" % "1.43-dt-20211202Z-01eaa7",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20211202Z-da5598",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221015Z-0a42ca",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20211202Z-1cc53d",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-76627f",
  "org.scalablytyped" %%% "restify" % "8.5-dt-20220810Z-5232cc",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-696f82",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20211202Z-514ee3",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20211202Z-4d9314",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "swagger-node-runner" % "0.6-dt-20211202Z-793ebe",
  "org.scalablytyped" %%% "swagger-schema-official" % "2.0-dt-20211202Z-4b5a2c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
