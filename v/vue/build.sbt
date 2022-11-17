organization := "org.scalablytyped"
name := "vue"
version := "3.2.45-823204"
scalaVersion := "3.2.2-RC1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "babel__parser" % "7.20.3-88d706",
  "org.scalablytyped" %%% "babel__types" % "7.20.2-a7b16d",
  "org.scalablytyped" %%% "csstype" % "3.1.1-b003b4",
  "org.scalablytyped" %%% "source-map" % "0.7.4-c38b99",
  "org.scalablytyped" %%% "std" % "4.9-448261",
  "org.scalablytyped" %%% "vue__compiler-core" % "3.2.45-97d93b",
  "org.scalablytyped" %%% "vue__reactivity" % "3.2.45-7b628e",
  "org.scalablytyped" %%% "vue__runtime-core" % "3.2.45-1fd4fb",
  "org.scalablytyped" %%% "vue__runtime-dom" % "3.2.45-cad865",
  "org.scalablytyped" %%% "vue__shared" % "3.2.45-c6abd0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
