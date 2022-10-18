organization := "org.scalablytyped"
name := "swiper"
version := "8.4.4-936d17"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.0-6f26a9",
  "org.scalablytyped" %%% "angular-devkit__core" % "14.2.3-efd9f2",
  "org.scalablytyped" %%% "angular-devkit__schematics" % "14.2.3-0192e4",
  "org.scalablytyped" %%% "angular__common" % "14.2.6-5f4b3d",
  "org.scalablytyped" %%% "angular__compiler" % "14.2.6-3db53d",
  "org.scalablytyped" %%% "angular__compiler-cli" % "14.2.2-aa5672",
  "org.scalablytyped" %%% "angular__core" % "14.2.6-f3d7ce",
  "org.scalablytyped" %%% "babel__core" % "7.1-dt-20220624Z-7b08cb",
  "org.scalablytyped" %%% "babel__generator" % "7.6-dt-20211223Z-27b6b7",
  "org.scalablytyped" %%% "babel__parser" % "7.19.4-d9b25c",
  "org.scalablytyped" %%% "babel__template" % "7.4-dt-20211202Z-1ba1f6",
  "org.scalablytyped" %%% "babel__traverse" % "7.18-dt-20220923Z-0e2ba7",
  "org.scalablytyped" %%% "babel__types" % "7.19.4-1978dd",
  "org.scalablytyped" %%% "convert-source-map" % "1.5-dt-20211202Z-1bfc7c",
  "org.scalablytyped" %%% "csstype" % "3.1.1-775404",
  "org.scalablytyped" %%% "dependency-graph" % "0.11.0-d90de9",
  "org.scalablytyped" %%% "dom7" % "4.0.4-1baf69",
  "org.scalablytyped" %%% "jsonc-parser" % "3.2.0-f8f486",
  "org.scalablytyped" %%% "magic-string" % "0.26.7-bd69f8",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221015Z-0a42ca",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-4c7983",
  "org.scalablytyped" %%% "re2" % "1.17.7-e9900d",
  "org.scalablytyped" %%% "react" % "18.0-dt-20220922Z-bacd1f",
  "org.scalablytyped" %%% "rxjs" % "7.5.7-0dd117",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-400bee",
  "org.scalablytyped" %%% "semver" % "7.3-dt-20220811Z-4e87db",
  "org.scalablytyped" %%% "source-map" % "0.7.4-942cbd",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "svelte" % "3.50.1-95d9d8",
  "org.scalablytyped" %%% "typescript" % "4.8.4-676e37",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-d613cd",
  "org.scalablytyped" %%% "vue__reactivity" % "3.2.41-669f2b",
  "org.scalablytyped" %%% "vue__runtime-core" % "3.2.41-c55f63",
  "org.scalablytyped" %%% "vue__shared" % "3.2.41-1967a8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
