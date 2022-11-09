organization := "org.scalablytyped"
name := "swiper"
version := "8.4.4-0d2b10"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.0-6482f2",
  "org.scalablytyped" %%% "angular-devkit__core" % "14.2.6-8f5b27",
  "org.scalablytyped" %%% "angular-devkit__schematics" % "14.2.6-27a8c8",
  "org.scalablytyped" %%% "angular__common" % "14.2.9-3b404f",
  "org.scalablytyped" %%% "angular__compiler" % "14.2.9-c4304c",
  "org.scalablytyped" %%% "angular__compiler-cli" % "14.2.7-6a9f2c",
  "org.scalablytyped" %%% "angular__core" % "14.2.9-e12767",
  "org.scalablytyped" %%% "babel__core" % "7.1-dt-20221107Z-efd9cc",
  "org.scalablytyped" %%% "babel__generator" % "7.6-dt-20211223Z-412870",
  "org.scalablytyped" %%% "babel__parser" % "7.20.3-021aec",
  "org.scalablytyped" %%% "babel__template" % "7.4-dt-20211202Z-744489",
  "org.scalablytyped" %%% "babel__traverse" % "7.18-dt-20220923Z-b54012",
  "org.scalablytyped" %%% "babel__types" % "7.20.2-5a1686",
  "org.scalablytyped" %%% "convert-source-map" % "1.5-dt-20211202Z-ed3b05",
  "org.scalablytyped" %%% "csstype" % "3.1.1-9ea52b",
  "org.scalablytyped" %%% "dependency-graph" % "0.11.0-efd2dc",
  "org.scalablytyped" %%% "dom7" % "4.0.4-d29633",
  "org.scalablytyped" %%% "jsonc-parser" % "3.2.0-09f6eb",
  "org.scalablytyped" %%% "magic-string" % "0.26.7-deb100",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-d0f137",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-115604",
  "org.scalablytyped" %%% "re2" % "1.17.7-a226e5",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221104Z-e64588",
  "org.scalablytyped" %%% "rxjs" % "7.5.7-6ac0e4",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-21791a",
  "org.scalablytyped" %%% "semver" % "7.3-dt-20221026Z-e709b4",
  "org.scalablytyped" %%% "source-map" % "0.7.4-01a3bb",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "svelte" % "3.52.0-eadd9b",
  "org.scalablytyped" %%% "typescript" % "4.8.4-60b1be",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-37b092",
  "org.scalablytyped" %%% "vue__reactivity" % "3.2.42-e349d3",
  "org.scalablytyped" %%% "vue__runtime-core" % "3.2.42-07dc53",
  "org.scalablytyped" %%% "vue__shared" % "3.2.42-ead2ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
