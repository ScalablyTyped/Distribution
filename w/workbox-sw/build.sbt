organization := "org.scalablytyped"
name := "workbox-sw"
version := "4.3-dt-20201002Z-0bc0c3"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab",
  "org.scalablytyped" %%% "workbox-background-sync" % "4.3-dt-20201002Z-d19ec7",
  "org.scalablytyped" %%% "workbox-broadcast-update" % "4.3-dt-20200515Z-263aa7",
  "org.scalablytyped" %%% "workbox-cacheable-response" % "4.3-dt-20200515Z-e4af7e",
  "org.scalablytyped" %%% "workbox-core" % "4.3-dt-20200515Z-980108",
  "org.scalablytyped" %%% "workbox-expiration" % "4.3-dt-20200515Z-f19c8e",
  "org.scalablytyped" %%% "workbox-google-analytics" % "4.3-dt-20200515Z-a0003f",
  "org.scalablytyped" %%% "workbox-precaching" % "4.3-dt-20200515Z-c0c40f",
  "org.scalablytyped" %%% "workbox-range-requests" % "4.3-dt-20200515Z-6c4a8e",
  "org.scalablytyped" %%% "workbox-routing" % "4.3-dt-20201002Z-c79c78",
  "org.scalablytyped" %%% "workbox-strategies" % "4.3-dt-20200515Z-2e9190",
  "org.scalablytyped" %%% "workbox-streams" % "4.3-dt-20200515Z-3362ef")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
