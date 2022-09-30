organization := "org.scalablytyped"
name := "swagger-node-runner"
version := "0.6-dt-20211202Z-0156c3"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "boom" % "7.3-dt-20220913Z-9938a9",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20211202Z-65a364",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20211202Z-de42af",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-646db4",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-53b851",
  "org.scalablytyped" %%% "formidable" % "2.0-dt-20220502Z-86d485",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20220819Z-1987f1",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20211202Z-d34071",
  "org.scalablytyped" %%% "joi" % "17.6.2-2be84d",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-fb8f3f",
  "org.scalablytyped" %%% "mime-db" % "1.43-dt-20211202Z-452777",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20211202Z-426026",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220926Z-d201ab",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20211202Z-b90bd8",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-4e85dc",
  "org.scalablytyped" %%% "restify" % "8.5-dt-20220810Z-2375b1",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-170623",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20211202Z-e95a27",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20211202Z-60df94",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb",
  "org.scalablytyped" %%% "swagger-schema-official" % "2.0-dt-20211202Z-c84f9a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
