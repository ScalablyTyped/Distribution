organization := "org.scalablytyped"
name := "vue-loader"
version := "15.9.5-c48a5a"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "postcss" % "7.0.35-5779b1",
  "org.scalablytyped" %%% "source-map" % "0.7.3-e38674",
  "org.scalablytyped" %%% "std" % "4.1-2f6855",
  "org.scalablytyped" %%% "vue" % "2.6.12-c3b74c",
  "org.scalablytyped" %%% "vue-template-compiler" % "2.6.12-961f3f",
  "org.scalablytyped" %%% "vue__component-compiler-utils" % "3.2.0-e5a8a0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
