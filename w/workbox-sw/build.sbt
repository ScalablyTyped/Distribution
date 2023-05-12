organization := "org.scalablytyped"
name := "workbox-sw"
version := "4.3-dt-20230102Z-358c23"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "workbox-background-sync" % "6.5.4-0fd36c",
  "org.scalablytyped" %%% "workbox-broadcast-update" % "6.5.4-c86e23",
  "org.scalablytyped" %%% "workbox-cacheable-response" % "6.5.4-32c176",
  "org.scalablytyped" %%% "workbox-core" % "6.5.4-efa277",
  "org.scalablytyped" %%% "workbox-expiration" % "6.5.4-a473c1",
  "org.scalablytyped" %%% "workbox-google-analytics" % "6.5.4-4890e8",
  "org.scalablytyped" %%% "workbox-navigation-preload" % "6.5.4-3c0c81",
  "org.scalablytyped" %%% "workbox-precaching" % "6.5.4-7edf37",
  "org.scalablytyped" %%% "workbox-range-requests" % "6.5.4-5a2a11",
  "org.scalablytyped" %%% "workbox-routing" % "6.5.4-fc413d",
  "org.scalablytyped" %%% "workbox-strategies" % "6.5.4-f2fe35",
  "org.scalablytyped" %%% "workbox-streams" % "6.5.4-4c96ed")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
