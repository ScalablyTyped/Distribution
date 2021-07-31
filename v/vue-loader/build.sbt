organization := "org.scalablytyped"
name := "vue-loader"
version := "15.9.5-6a014e"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "postcss" % "7.0.35-bd5010",
  "org.scalablytyped" %%% "source-map" % "0.7.3-755fd4",
  "org.scalablytyped" %%% "std" % "4.1-044efb",
  "org.scalablytyped" %%% "vue" % "2.6.12-d4c5c7",
  "org.scalablytyped" %%% "vue-template-compiler" % "2.6.12-dc0d4a",
  "org.scalablytyped" %%% "vue__component-compiler-utils" % "3.2.0-9b918e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
