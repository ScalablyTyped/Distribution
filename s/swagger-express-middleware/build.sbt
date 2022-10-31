organization := "org.scalablytyped"
name := "swagger-express-middleware"
version := "1.x-dt-20211202Z-00e22a"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "apidevtools__swagger-parser" % "10.1.0-efca35",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-faf4dd",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-ed8fc0",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-3b1911",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221030Z-57fc1b",
  "org.scalablytyped" %%% "openapi-types" % "12.0.2-9d620b",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-33ed42",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-f95ba3",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "swagger-parser" % "10.0.3-c17027")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
