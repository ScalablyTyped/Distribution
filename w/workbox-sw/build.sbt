organization := "org.scalablytyped"
name := "workbox-sw"
version := "4.3-dt-20220624Z-cf9acc"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "workbox-background-sync" % "4.3-dt-20211202Z-dc9dbd",
  "org.scalablytyped" %%% "workbox-broadcast-update" % "4.3-dt-20211202Z-f5ac21",
  "org.scalablytyped" %%% "workbox-cacheable-response" % "4.3-dt-20211202Z-927070",
  "org.scalablytyped" %%% "workbox-core" % "4.3-dt-20211202Z-13362b",
  "org.scalablytyped" %%% "workbox-expiration" % "4.3-dt-20211202Z-2d42df",
  "org.scalablytyped" %%% "workbox-google-analytics" % "4.3-dt-20211202Z-45a848",
  "org.scalablytyped" %%% "workbox-precaching" % "4.3-dt-20211202Z-5ccef9",
  "org.scalablytyped" %%% "workbox-range-requests" % "4.3-dt-20211202Z-1d2fb7",
  "org.scalablytyped" %%% "workbox-routing" % "4.3-dt-20211202Z-0be1fd",
  "org.scalablytyped" %%% "workbox-strategies" % "4.3-dt-20211202Z-81d67e",
  "org.scalablytyped" %%% "workbox-streams" % "4.3-dt-20211202Z-46c27a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
