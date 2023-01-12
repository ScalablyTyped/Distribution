organization := "org.scalablytyped"
name := "swiper"
version := "8.4.4-43b454"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.2-e03df2",
  "org.scalablytyped" %%% "angular-devkit__core" % "14.2.6-555c59",
  "org.scalablytyped" %%% "angular-devkit__schematics" % "14.2.6-3fc27f",
  "org.scalablytyped" %%% "angular__common" % "14.2.10-951f05",
  "org.scalablytyped" %%% "angular__compiler" % "14.2.10-9da090",
  "org.scalablytyped" %%% "angular__compiler-cli" % "14.2.7-10ac45",
  "org.scalablytyped" %%% "angular__core" % "14.2.10-a1f126",
  "org.scalablytyped" %%% "babel__core" % "7.1-dt-20221107Z-5b3929",
  "org.scalablytyped" %%% "babel__generator" % "7.6-dt-20211223Z-5fc152",
  "org.scalablytyped" %%% "babel__parser" % "7.20.3-0ceec3",
  "org.scalablytyped" %%% "babel__template" % "7.4-dt-20211202Z-10b9d5",
  "org.scalablytyped" %%% "babel__traverse" % "7.18-dt-20220923Z-b27c06",
  "org.scalablytyped" %%% "babel__types" % "7.20.2-0db274",
  "org.scalablytyped" %%% "convert-source-map" % "1.5-dt-20211202Z-0de974",
  "org.scalablytyped" %%% "csstype" % "3.1.1-9b270c",
  "org.scalablytyped" %%% "dependency-graph" % "0.11.0-edf6e0",
  "org.scalablytyped" %%% "dom7" % "4.0.4-fd8ea7",
  "org.scalablytyped" %%% "jsonc-parser" % "3.2.0-18e12a",
  "org.scalablytyped" %%% "magic-string" % "0.26.7-dba250",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-874609",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-9c1d48",
  "org.scalablytyped" %%% "re2" % "1.17.7-31fc73",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221104Z-c1aa2f",
  "org.scalablytyped" %%% "rxjs" % "7.5.7-d48537",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-fd69ea",
  "org.scalablytyped" %%% "semver" % "7.3-dt-20221026Z-7e28ad",
  "org.scalablytyped" %%% "source-map" % "0.7.4-0d2ade",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb",
  "org.scalablytyped" %%% "svelte" % "3.52.0-bcd3dd",
  "org.scalablytyped" %%% "typescript" % "4.9.3-94f598",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-8d8221",
  "org.scalablytyped" %%% "vue__reactivity" % "3.2.45-85ea73",
  "org.scalablytyped" %%% "vue__runtime-core" % "3.2.45-843bf7",
  "org.scalablytyped" %%% "vue__shared" % "3.2.45-ab0053")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
