organization := "org.scalablytyped"
name := "vue-server-renderer"
version := "2.7.13-7ea713"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.0-fcbdcb",
  "org.scalablytyped" %%% "estree" % "1.0-dt-20220712Z-6f817a",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20220325Z-349280",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221026Z-107efe",
  "org.scalablytyped" %%% "re2" % "1.17.7-18b669",
  "org.scalablytyped" %%% "schema-utils" % "4.0.0-9310ee",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "tapable" % "2.2.1-52b605",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-37b092",
  "org.scalablytyped" %%% "vue__reactivity" % "3.2.41-d09629",
  "org.scalablytyped" %%% "vue__runtime-core" % "3.2.41-066460",
  "org.scalablytyped" %%% "vue__shared" % "3.2.41-a50cde",
  "org.scalablytyped" %%% "webpack" % "5.74.0-641d67")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
