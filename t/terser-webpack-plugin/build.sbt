organization := "org.scalablytyped"
name := "terser-webpack-plugin"
version := "5.3.6-5c9b22"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.2-e03df2",
  "org.scalablytyped" %%% "jest-worker" % "29.3.1-10e839",
  "org.scalablytyped" %%% "jridgewell__gen-mapping" % "0.3.2-2d9eaa",
  "org.scalablytyped" %%% "jridgewell__trace-mapping" % "0.3.17-ceea3a",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20220325Z-64302b",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-874609",
  "org.scalablytyped" %%% "re2" % "1.17.7-31fc73",
  "org.scalablytyped" %%% "schema-utils" % "4.0.0-21a261",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb",
  "org.scalablytyped" %%% "terser" % "5.15.1-681bb4",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-8d8221")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
