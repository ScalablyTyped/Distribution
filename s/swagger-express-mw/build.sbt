organization := "org.scalablytyped"
name := "swagger-express-mw"
version := "0.7-dt-20211202Z-b9bcaa"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "boom" % "7.3-dt-20221103Z-559ca8",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20211202Z-e17624",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20211202Z-48035d",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-a7050d",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-2c076a",
  "org.scalablytyped" %%% "formidable" % "2.0-dt-20220502Z-e77446",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20221103Z-8629b9",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20211202Z-93d005",
  "org.scalablytyped" %%% "joi" % "17.7.0-d79f84",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-e2d669",
  "org.scalablytyped" %%% "mime-db" % "1.43-dt-20211202Z-937928",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20211202Z-b7301a",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-86f548",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20211202Z-e6f5b9",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-c05674",
  "org.scalablytyped" %%% "restify" % "8.5-dt-20220810Z-c19555",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-9d2495",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20211202Z-fca171",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20211202Z-12ba75",
  "org.scalablytyped" %%% "std" % "4.8-686d1d",
  "org.scalablytyped" %%% "swagger-node-runner" % "0.6-dt-20211202Z-654f8e",
  "org.scalablytyped" %%% "swagger-schema-official" % "2.0-dt-20211202Z-0d4bbf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
