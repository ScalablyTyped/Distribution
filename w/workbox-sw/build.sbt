organization := "org.scalablytyped"
name := "workbox-sw"
version := "4.3-dt-20201002Z-f0bb40"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "std" % "4.1-2f6855",
  "org.scalablytyped" %%% "workbox-background-sync" % "4.3-dt-20201002Z-81bf7c",
  "org.scalablytyped" %%% "workbox-broadcast-update" % "4.3-dt-20200515Z-43ca19",
  "org.scalablytyped" %%% "workbox-cacheable-response" % "4.3-dt-20200515Z-8e2af7",
  "org.scalablytyped" %%% "workbox-core" % "4.3-dt-20200515Z-677aa8",
  "org.scalablytyped" %%% "workbox-expiration" % "4.3-dt-20200515Z-a2cde8",
  "org.scalablytyped" %%% "workbox-google-analytics" % "4.3-dt-20200515Z-823243",
  "org.scalablytyped" %%% "workbox-precaching" % "4.3-dt-20200515Z-960c66",
  "org.scalablytyped" %%% "workbox-range-requests" % "4.3-dt-20200515Z-37831c",
  "org.scalablytyped" %%% "workbox-routing" % "4.3-dt-20201002Z-0b2716",
  "org.scalablytyped" %%% "workbox-strategies" % "4.3-dt-20200515Z-4a86b6",
  "org.scalablytyped" %%% "workbox-streams" % "4.3-dt-20200515Z-c07cab")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
