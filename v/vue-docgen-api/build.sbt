organization := "org.scalablytyped"
name := "vue-docgen-api"
version := "4.33.9-9cf856"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ast-types" % "0.14.2-f66803",
  "org.scalablytyped" %%% "babel__parser" % "7.12.7-799cf5",
  "org.scalablytyped" %%% "babel__types" % "7.12.7-8c7046",
  "org.scalablytyped" %%% "pug" % "2.0-dt-20201002Z-d92121",
  "org.scalablytyped" %%% "source-map" % "0.7.3-e38674",
  "org.scalablytyped" %%% "std" % "4.1-2f6855",
  "org.scalablytyped" %%% "ts-map" % "1.0.3-4e50b0",
  "org.scalablytyped" %%% "vue-inbrowser-compiler-utils" % "4.33.6-70d69e",
  "org.scalablytyped" %%% "vue__compiler-core" % "3.0.2-d39971")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
