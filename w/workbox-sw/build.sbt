organization := "org.scalablytyped"
name := "workbox-sw"
version := "4.3-dt-20201002Z-0050e6"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "std" % "4.1-044efb",
  "org.scalablytyped" %%% "workbox-background-sync" % "4.3-dt-20201002Z-9c0720",
  "org.scalablytyped" %%% "workbox-broadcast-update" % "4.3-dt-20200515Z-50df17",
  "org.scalablytyped" %%% "workbox-cacheable-response" % "4.3-dt-20200515Z-781fea",
  "org.scalablytyped" %%% "workbox-core" % "4.3-dt-20200515Z-4044d6",
  "org.scalablytyped" %%% "workbox-expiration" % "4.3-dt-20200515Z-d19a18",
  "org.scalablytyped" %%% "workbox-google-analytics" % "4.3-dt-20200515Z-4b035f",
  "org.scalablytyped" %%% "workbox-precaching" % "4.3-dt-20200515Z-48e35e",
  "org.scalablytyped" %%% "workbox-range-requests" % "4.3-dt-20200515Z-4d1540",
  "org.scalablytyped" %%% "workbox-routing" % "4.3-dt-20201002Z-fb4fbc",
  "org.scalablytyped" %%% "workbox-strategies" % "4.3-dt-20200515Z-9d67d1",
  "org.scalablytyped" %%% "workbox-streams" % "4.3-dt-20200515Z-78a80a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
