organization := "org.scalablytyped"
name := "vue-loader"
version := "15.9.5-44e623"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "postcss" % "7.0.35-7d3225",
  "org.scalablytyped" %%% "source-map" % "0.7.3-081b8e",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab",
  "org.scalablytyped" %%% "vue" % "2.6.12-a5f695",
  "org.scalablytyped" %%% "vue-template-compiler" % "2.6.12-4a2fb1",
  "org.scalablytyped" %%% "vue__component-compiler-utils" % "3.2.0-4c2dd3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
