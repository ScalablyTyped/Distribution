organization := "org.scalablytyped"
name := "vue-rx"
version := "6.2.0-b8d50e"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "babel__parser" % "7.20.3-5a73bf",
  "org.scalablytyped" %%% "babel__types" % "7.20.2-b582b5",
  "org.scalablytyped" %%% "csstype" % "3.1.1-4db30e",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-def929",
  "org.scalablytyped" %%% "rxjs" % "7.5.7-fec6f6",
  "org.scalablytyped" %%% "source-map" % "0.7.4-14f7e0",
  "org.scalablytyped" %%% "std" % "4.9-5f989f",
  "org.scalablytyped" %%% "vue" % "3.2.45-d5f424",
  "org.scalablytyped" %%% "vue__compiler-core" % "3.2.45-dffd40",
  "org.scalablytyped" %%% "vue__reactivity" % "3.2.45-433ea1",
  "org.scalablytyped" %%% "vue__runtime-core" % "3.2.45-ccab93",
  "org.scalablytyped" %%% "vue__runtime-dom" % "3.2.45-419c39",
  "org.scalablytyped" %%% "vue__shared" % "3.2.45-86009a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
