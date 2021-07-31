organization := "org.scalablytyped"
name := "vue-docgen-api"
version := "4.33.9-1425ea"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ast-types" % "0.14.2-2f38be",
  "org.scalablytyped" %%% "babel__parser" % "7.12.7-e54b91",
  "org.scalablytyped" %%% "babel__types" % "7.12.7-b1a5d6",
  "org.scalablytyped" %%% "pug" % "2.0-dt-20201002Z-8f5477",
  "org.scalablytyped" %%% "source-map" % "0.7.3-755fd4",
  "org.scalablytyped" %%% "std" % "4.1-044efb",
  "org.scalablytyped" %%% "ts-map" % "1.0.3-b39129",
  "org.scalablytyped" %%% "vue-inbrowser-compiler-utils" % "4.33.6-716b88",
  "org.scalablytyped" %%% "vue__compiler-core" % "3.0.2-a067ba")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
