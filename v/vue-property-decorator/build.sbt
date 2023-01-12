organization := "org.scalablytyped"
name := "vue-property-decorator"
version := "9.1.2-fb4606"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "babel__parser" % "7.20.3-0ceec3",
  "org.scalablytyped" %%% "babel__types" % "7.20.2-0db274",
  "org.scalablytyped" %%% "csstype" % "3.1.1-9b270c",
  "org.scalablytyped" %%% "source-map" % "0.7.4-0d2ade",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb",
  "org.scalablytyped" %%% "vue" % "3.2.45-a64ccf",
  "org.scalablytyped" %%% "vue-class-component" % "7.2.6-6c3ee5",
  "org.scalablytyped" %%% "vue__compiler-core" % "3.2.45-d8dd2e",
  "org.scalablytyped" %%% "vue__reactivity" % "3.2.45-85ea73",
  "org.scalablytyped" %%% "vue__runtime-core" % "3.2.45-843bf7",
  "org.scalablytyped" %%% "vue__runtime-dom" % "3.2.45-6ed395",
  "org.scalablytyped" %%% "vue__shared" % "3.2.45-ab0053")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
