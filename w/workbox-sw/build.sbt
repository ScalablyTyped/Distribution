organization := "org.scalablytyped"
name := "workbox-sw"
version := "4.3-dt-20220624Z-fe649c"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "workbox-background-sync" % "4.3-dt-20211202Z-e82c8e",
  "org.scalablytyped" %%% "workbox-broadcast-update" % "4.3-dt-20211202Z-0458c5",
  "org.scalablytyped" %%% "workbox-cacheable-response" % "4.3-dt-20211202Z-80e108",
  "org.scalablytyped" %%% "workbox-core" % "4.3-dt-20211202Z-fe1921",
  "org.scalablytyped" %%% "workbox-expiration" % "4.3-dt-20211202Z-cb2248",
  "org.scalablytyped" %%% "workbox-google-analytics" % "4.3-dt-20211202Z-7cb40b",
  "org.scalablytyped" %%% "workbox-precaching" % "4.3-dt-20211202Z-7ca6aa",
  "org.scalablytyped" %%% "workbox-range-requests" % "4.3-dt-20211202Z-27ecbf",
  "org.scalablytyped" %%% "workbox-routing" % "4.3-dt-20211202Z-f2c3b0",
  "org.scalablytyped" %%% "workbox-strategies" % "4.3-dt-20211202Z-1d8784",
  "org.scalablytyped" %%% "workbox-streams" % "4.3-dt-20211202Z-b70d78")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
