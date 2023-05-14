organization := "org.scalablytyped"
name := "terser-webpack-plugin"
version := "5.3.8-3d822f"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.12.0-aebde1",
  "org.scalablytyped" %%% "jest-worker" % "29.5.0-27be59",
  "org.scalablytyped" %%% "jridgewell__gen-mapping" % "0.3.3-d76206",
  "org.scalablytyped" %%% "jridgewell__trace-mapping" % "0.3.18-9410d5",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20220325Z-c415ea",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230513Z-b25634",
  "org.scalablytyped" %%% "re2" % "1.18.0-6019fb",
  "org.scalablytyped" %%% "schema-utils" % "4.0.1-ac38e5",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "terser" % "5.17.3-f351fb",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-347272")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
