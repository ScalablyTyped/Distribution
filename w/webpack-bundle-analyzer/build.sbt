organization := "org.scalablytyped"
name := "webpack-bundle-analyzer"
version := "4.6-dt-20221005Z-cf1b55"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.12.0-aebde1",
  "org.scalablytyped" %%% "estree" % "1.0-dt-20230419Z-f51b02",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20220325Z-c415ea",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230513Z-b25634",
  "org.scalablytyped" %%% "re2" % "1.18.0-6019fb",
  "org.scalablytyped" %%% "schema-utils" % "4.0.1-ac38e5",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "tapable" % "2.2.1-b557e4",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-347272",
  "org.scalablytyped" %%% "webpack" % "5.82.1-4ed941")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
