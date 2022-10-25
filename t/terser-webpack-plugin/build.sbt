organization := "org.scalablytyped"
name := "terser-webpack-plugin"
version := "5.3.6-e289c4"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.0-20bcca",
  "org.scalablytyped" %%% "jest-worker" % "29.2.1-efbec0",
  "org.scalablytyped" %%% "jridgewell__gen-mapping" % "0.3.2-ae4999",
  "org.scalablytyped" %%% "jridgewell__trace-mapping" % "0.3.17-81dbd7",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20220325Z-349280",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221024Z-2be228",
  "org.scalablytyped" %%% "re2" % "1.17.7-5ddb3b",
  "org.scalablytyped" %%% "schema-utils" % "4.0.0-1e0b25",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "terser" % "5.15.1-0f2329",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-37b092")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
