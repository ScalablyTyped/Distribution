organization := "org.scalablytyped"
name := "workbox-sw"
version := "4.3-dt-20220624Z-d02d4e"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "std" % "4.9-5f989f",
  "org.scalablytyped" %%% "workbox-background-sync" % "4.3-dt-20211202Z-bdd3bb",
  "org.scalablytyped" %%% "workbox-broadcast-update" % "4.3-dt-20211202Z-3f7400",
  "org.scalablytyped" %%% "workbox-cacheable-response" % "4.3-dt-20211202Z-42d16d",
  "org.scalablytyped" %%% "workbox-core" % "4.3-dt-20211202Z-50e982",
  "org.scalablytyped" %%% "workbox-expiration" % "4.3-dt-20211202Z-9c06a9",
  "org.scalablytyped" %%% "workbox-google-analytics" % "4.3-dt-20211202Z-126afb",
  "org.scalablytyped" %%% "workbox-precaching" % "4.3-dt-20211202Z-b21e1c",
  "org.scalablytyped" %%% "workbox-range-requests" % "4.3-dt-20211202Z-f886a1",
  "org.scalablytyped" %%% "workbox-routing" % "4.3-dt-20211202Z-2c5e80",
  "org.scalablytyped" %%% "workbox-strategies" % "4.3-dt-20211202Z-9a120b",
  "org.scalablytyped" %%% "workbox-streams" % "4.3-dt-20211202Z-d1a233")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
