organization := "org.scalablytyped"
name := "workbox-webpack-plugin"
version := "6.5.4-83bb64"
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
  "org.scalablytyped" %%% "source-map" % "0.7.4-e1e422",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "tapable" % "2.2.1-b557e4",
  "org.scalablytyped" %%% "type-fest" % "3.10.0-9a1e17",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-347272",
  "org.scalablytyped" %%% "webpack" % "5.82.1-4ed941",
  "org.scalablytyped" %%% "workbox-background-sync" % "6.5.4-0fd36c",
  "org.scalablytyped" %%% "workbox-broadcast-update" % "6.5.4-c86e23",
  "org.scalablytyped" %%% "workbox-build" % "6.5.4-6210c7",
  "org.scalablytyped" %%% "workbox-cacheable-response" % "6.5.4-32c176",
  "org.scalablytyped" %%% "workbox-core" % "6.5.4-efa277",
  "org.scalablytyped" %%% "workbox-expiration" % "6.5.4-a473c1",
  "org.scalablytyped" %%% "workbox-google-analytics" % "6.5.4-4890e8",
  "org.scalablytyped" %%% "workbox-routing" % "6.5.4-fc413d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
