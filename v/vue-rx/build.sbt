organization := "org.scalablytyped"
name := "vue-rx"
version := "6.2.0-bbd5f5"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "babel__parser" % "7.19.4-d9b25c",
  "org.scalablytyped" %%% "babel__types" % "7.19.4-1978dd",
  "org.scalablytyped" %%% "csstype" % "3.1.1-775404",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221015Z-0a42ca",
  "org.scalablytyped" %%% "rxjs" % "7.5.7-0dd117",
  "org.scalablytyped" %%% "source-map" % "0.7.4-942cbd",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "vue" % "3.2.41-e68121",
  "org.scalablytyped" %%% "vue__compiler-core" % "3.2.41-88c8af",
  "org.scalablytyped" %%% "vue__reactivity" % "3.2.41-669f2b",
  "org.scalablytyped" %%% "vue__runtime-core" % "3.2.41-c55f63",
  "org.scalablytyped" %%% "vue__runtime-dom" % "3.2.41-efb818",
  "org.scalablytyped" %%% "vue__shared" % "3.2.41-1967a8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
