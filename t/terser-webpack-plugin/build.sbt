organization := "org.scalablytyped"
name := "terser-webpack-plugin"
version := "5.3.6-2979f9"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.0-fcbdcb",
  "org.scalablytyped" %%% "jest-worker" % "29.2.1-6f86bd",
  "org.scalablytyped" %%% "jridgewell__gen-mapping" % "0.3.2-ae4999",
  "org.scalablytyped" %%% "jridgewell__trace-mapping" % "0.3.17-81dbd7",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20220325Z-349280",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221026Z-107efe",
  "org.scalablytyped" %%% "re2" % "1.17.7-18b669",
  "org.scalablytyped" %%% "schema-utils" % "4.0.0-9310ee",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "terser" % "5.15.1-0f2329",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-37b092")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
