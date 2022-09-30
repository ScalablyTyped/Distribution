organization := "org.scalablytyped"
name := "workbox-sw"
version := "4.3-dt-20220624Z-df3d09"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb",
  "org.scalablytyped" %%% "workbox-background-sync" % "4.3-dt-20211202Z-dff2a6",
  "org.scalablytyped" %%% "workbox-broadcast-update" % "4.3-dt-20211202Z-9cbe14",
  "org.scalablytyped" %%% "workbox-cacheable-response" % "4.3-dt-20211202Z-209906",
  "org.scalablytyped" %%% "workbox-core" % "4.3-dt-20211202Z-740c82",
  "org.scalablytyped" %%% "workbox-expiration" % "4.3-dt-20211202Z-a005c4",
  "org.scalablytyped" %%% "workbox-google-analytics" % "4.3-dt-20211202Z-f2715d",
  "org.scalablytyped" %%% "workbox-precaching" % "4.3-dt-20211202Z-999802",
  "org.scalablytyped" %%% "workbox-range-requests" % "4.3-dt-20211202Z-8df81e",
  "org.scalablytyped" %%% "workbox-routing" % "4.3-dt-20211202Z-686c93",
  "org.scalablytyped" %%% "workbox-strategies" % "4.3-dt-20211202Z-e2d2c0",
  "org.scalablytyped" %%% "workbox-streams" % "4.3-dt-20211202Z-a9cfc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
