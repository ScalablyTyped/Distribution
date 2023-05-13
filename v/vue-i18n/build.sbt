organization := "org.scalablytyped"
name := "vue-i18n"
version := "9.2.2-cdd22f"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "intlify__core-base" % "9.2.2-c1ed75",
  "org.scalablytyped" %%% "intlify__devtools-if" % "9.2.2-554171",
  "org.scalablytyped" %%% "intlify__message-compiler" % "9.2.2-7d8f5f",
  "org.scalablytyped" %%% "intlify__shared" % "9.2.2-c670e0",
  "org.scalablytyped" %%% "intlify__vue-devtools" % "9.2.2-6fc7e3",
  "org.scalablytyped" %%% "source-map" % "0.7.4-e1e422",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "vue__reactivity" % "3.3.2-725762",
  "org.scalablytyped" %%% "vue__runtime-core" % "3.3.2-b7cace",
  "org.scalablytyped" %%% "vue__shared" % "3.3.2-d52317")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
