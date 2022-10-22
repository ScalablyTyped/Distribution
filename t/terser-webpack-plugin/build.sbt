organization := "org.scalablytyped"
name := "terser-webpack-plugin"
version := "5.3.6-a44c22"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.0-f4a508",
  "org.scalablytyped" %%% "jest-worker" % "29.2.1-5de800",
  "org.scalablytyped" %%% "jridgewell__gen-mapping" % "0.3.2-1bda13",
  "org.scalablytyped" %%% "jridgewell__trace-mapping" % "0.3.17-593426",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20220325Z-58e21d",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221020Z-d73de4",
  "org.scalablytyped" %%% "re2" % "1.17.7-9752ba",
  "org.scalablytyped" %%% "schema-utils" % "4.0.0-547e57",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "terser" % "5.15.1-3697d4",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-d613cd")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
