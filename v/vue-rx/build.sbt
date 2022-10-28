organization := "org.scalablytyped"
name := "vue-rx"
version := "6.2.0-5e4908"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "babel__parser" % "7.20.0-6157ab",
  "org.scalablytyped" %%% "babel__types" % "7.20.0-d18d74",
  "org.scalablytyped" %%% "csstype" % "3.1.1-9ea52b",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221026Z-107efe",
  "org.scalablytyped" %%% "rxjs" % "7.5.7-a78fa8",
  "org.scalablytyped" %%% "source-map" % "0.7.4-01a3bb",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "vue" % "3.2.41-59e1a9",
  "org.scalablytyped" %%% "vue__compiler-core" % "3.2.41-4337e8",
  "org.scalablytyped" %%% "vue__reactivity" % "3.2.41-d09629",
  "org.scalablytyped" %%% "vue__runtime-core" % "3.2.41-066460",
  "org.scalablytyped" %%% "vue__runtime-dom" % "3.2.41-c257ff",
  "org.scalablytyped" %%% "vue__shared" % "3.2.41-a50cde")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
