organization := "org.scalablytyped"
name := "terser-webpack-plugin"
version := "5.3.6-15bd21"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.0-025d79",
  "org.scalablytyped" %%% "jest-worker" % "29.0.3-4f8570",
  "org.scalablytyped" %%% "jridgewell__gen-mapping" % "0.3.2-dfc28b",
  "org.scalablytyped" %%% "jridgewell__trace-mapping" % "0.3.15-7a644b",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20220325Z-aaec85",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220913Z-77cc8d",
  "org.scalablytyped" %%% "re2" % "1.17.7-22ea4f",
  "org.scalablytyped" %%% "schema-utils" % "4.0.0-ca6ee9",
  "org.scalablytyped" %%% "std" % "4.8-958c79",
  "org.scalablytyped" %%% "terser" % "5.15.0-3c5d1c",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-33748e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
