organization := "org.scalablytyped"
name := "swagger-express-middleware"
version := "1.x-dt-20211202Z-53c36d"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "apidevtools__swagger-parser" % "10.1.0-5de5f7",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-7a82fe",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-87e3cc",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-3b1911",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221026Z-107efe",
  "org.scalablytyped" %%% "openapi-types" % "12.0.2-9d620b",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-33ed42",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-5e7139",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "swagger-parser" % "10.0.3-1dc3dc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
