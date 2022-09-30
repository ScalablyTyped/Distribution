organization := "org.scalablytyped"
name := "swiper"
version := "8.4.2-648eca"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.0-7e3772",
  "org.scalablytyped" %%% "angular-devkit__core" % "14.2.3-63fde9",
  "org.scalablytyped" %%% "angular-devkit__schematics" % "14.2.3-b98780",
  "org.scalablytyped" %%% "angular__common" % "14.2.4-91665d",
  "org.scalablytyped" %%% "angular__compiler" % "14.2.4-f472dd",
  "org.scalablytyped" %%% "angular__compiler-cli" % "14.2.2-35c052",
  "org.scalablytyped" %%% "angular__core" % "14.2.4-936d25",
  "org.scalablytyped" %%% "babel__core" % "7.1-dt-20220624Z-b71763",
  "org.scalablytyped" %%% "babel__generator" % "7.6-dt-20211223Z-b5681a",
  "org.scalablytyped" %%% "babel__parser" % "7.19.3-2e0c60",
  "org.scalablytyped" %%% "babel__template" % "7.4-dt-20211202Z-3905f1",
  "org.scalablytyped" %%% "babel__traverse" % "7.18-dt-20220923Z-eae752",
  "org.scalablytyped" %%% "babel__types" % "7.19.3-af77a5",
  "org.scalablytyped" %%% "convert-source-map" % "1.5-dt-20211202Z-abdbb9",
  "org.scalablytyped" %%% "csstype" % "3.1.1-0912f8",
  "org.scalablytyped" %%% "dependency-graph" % "0.11.0-a83138",
  "org.scalablytyped" %%% "dom7" % "4.0.4-462511",
  "org.scalablytyped" %%% "jsonc-parser" % "3.2.0-1cea99",
  "org.scalablytyped" %%% "magic-string" % "0.26.4-0cfc9f",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220926Z-d201ab",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-975e63",
  "org.scalablytyped" %%% "re2" % "1.17.7-80a78e",
  "org.scalablytyped" %%% "react" % "18.0-dt-20220922Z-fc8273",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-3fbb8c",
  "org.scalablytyped" %%% "semver" % "7.3-dt-20220811Z-8f7d96",
  "org.scalablytyped" %%% "source-map" % "0.7.4-09b2a8",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb",
  "org.scalablytyped" %%% "typescript" % "4.8.4-6579b4",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-6052b3",
  "org.scalablytyped" %%% "vue__reactivity" % "3.2.40-ebc42d",
  "org.scalablytyped" %%% "vue__runtime-core" % "3.2.40-e02aad",
  "org.scalablytyped" %%% "vue__shared" % "3.2.40-4587d5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
