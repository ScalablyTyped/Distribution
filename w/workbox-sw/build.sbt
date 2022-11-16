organization := "org.scalablytyped"
name := "workbox-sw"
version := "4.3-dt-20220624Z-ac25be"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "std" % "4.9-c133ce",
  "org.scalablytyped" %%% "workbox-background-sync" % "4.3-dt-20211202Z-3a036b",
  "org.scalablytyped" %%% "workbox-broadcast-update" % "4.3-dt-20211202Z-d0b17b",
  "org.scalablytyped" %%% "workbox-cacheable-response" % "4.3-dt-20211202Z-eb6c7c",
  "org.scalablytyped" %%% "workbox-core" % "4.3-dt-20211202Z-eb4ea0",
  "org.scalablytyped" %%% "workbox-expiration" % "4.3-dt-20211202Z-398e2c",
  "org.scalablytyped" %%% "workbox-google-analytics" % "4.3-dt-20211202Z-5ae351",
  "org.scalablytyped" %%% "workbox-precaching" % "4.3-dt-20211202Z-71fa06",
  "org.scalablytyped" %%% "workbox-range-requests" % "4.3-dt-20211202Z-438a14",
  "org.scalablytyped" %%% "workbox-routing" % "4.3-dt-20211202Z-2fe660",
  "org.scalablytyped" %%% "workbox-strategies" % "4.3-dt-20211202Z-0066b8",
  "org.scalablytyped" %%% "workbox-streams" % "4.3-dt-20211202Z-3b9d42")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
