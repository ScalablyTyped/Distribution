organization := "org.scalablytyped"
name := "vue-docgen-api"
version := "4.33.9-063b68"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ast-types" % "0.14.2-467619",
  "org.scalablytyped" %%% "babel__parser" % "7.12.7-2a748a",
  "org.scalablytyped" %%% "babel__types" % "7.12.7-d40586",
  "org.scalablytyped" %%% "pug" % "2.0-dt-20201002Z-8d899d",
  "org.scalablytyped" %%% "source-map" % "0.7.3-081b8e",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab",
  "org.scalablytyped" %%% "ts-map" % "1.0.3-6f12a9",
  "org.scalablytyped" %%% "vue-inbrowser-compiler-utils" % "4.33.6-746310",
  "org.scalablytyped" %%% "vue__compiler-core" % "3.0.2-8b9f8b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
