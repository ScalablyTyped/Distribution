organization := "org.scalablytyped"
name := "workbox-strategies"
version := "4.3-dt-20211202Z-1d8784"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "workbox-core" % "4.3-dt-20211202Z-fe1921",
  "org.scalablytyped" %%% "workbox-routing" % "4.3-dt-20211202Z-f2c3b0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
