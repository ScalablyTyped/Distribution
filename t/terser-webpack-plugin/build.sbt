organization := "org.scalablytyped"
name := "terser-webpack-plugin"
version := "5.3.6-4c339f"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.2-8ddd54",
  "org.scalablytyped" %%% "jest-worker" % "29.3.1-b71083",
  "org.scalablytyped" %%% "jridgewell__gen-mapping" % "0.3.2-96a273",
  "org.scalablytyped" %%% "jridgewell__trace-mapping" % "0.3.17-39cb8a",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20220325Z-aa50bf",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-86f548",
  "org.scalablytyped" %%% "re2" % "1.17.7-349e63",
  "org.scalablytyped" %%% "schema-utils" % "4.0.0-91ce3a",
  "org.scalablytyped" %%% "std" % "4.8-686d1d",
  "org.scalablytyped" %%% "terser" % "5.15.1-4e72e1",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-af3fab")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
