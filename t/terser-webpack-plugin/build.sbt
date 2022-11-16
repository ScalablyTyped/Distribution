organization := "org.scalablytyped"
name := "terser-webpack-plugin"
version := "5.3.6-59b961"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.2-3b5adf",
  "org.scalablytyped" %%% "jest-worker" % "29.3.1-9454ae",
  "org.scalablytyped" %%% "jridgewell__gen-mapping" % "0.3.2-b7ce48",
  "org.scalablytyped" %%% "jridgewell__trace-mapping" % "0.3.17-72c66f",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20220325Z-fdd79d",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-4346d8",
  "org.scalablytyped" %%% "re2" % "1.17.7-7b689a",
  "org.scalablytyped" %%% "schema-utils" % "4.0.0-dd595f",
  "org.scalablytyped" %%% "std" % "4.9-c133ce",
  "org.scalablytyped" %%% "terser" % "5.15.1-db24d3",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-9ebd39")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
