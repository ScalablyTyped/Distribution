organization := "org.scalablytyped"
name := "workbox-sw"
version := "4.3-dt-20201002Z-ab3df0"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "std" % "4.1-40053c",
  "org.scalablytyped" %%% "workbox-background-sync" % "4.3-dt-20201002Z-a324b4",
  "org.scalablytyped" %%% "workbox-broadcast-update" % "4.3-dt-20200515Z-22323f",
  "org.scalablytyped" %%% "workbox-cacheable-response" % "4.3-dt-20200515Z-54756f",
  "org.scalablytyped" %%% "workbox-core" % "4.3-dt-20200515Z-196d96",
  "org.scalablytyped" %%% "workbox-expiration" % "4.3-dt-20200515Z-7d656f",
  "org.scalablytyped" %%% "workbox-google-analytics" % "4.3-dt-20200515Z-1efb55",
  "org.scalablytyped" %%% "workbox-precaching" % "4.3-dt-20200515Z-5968ba",
  "org.scalablytyped" %%% "workbox-range-requests" % "4.3-dt-20200515Z-e0688f",
  "org.scalablytyped" %%% "workbox-routing" % "4.3-dt-20201002Z-fdd2e4",
  "org.scalablytyped" %%% "workbox-strategies" % "4.3-dt-20200515Z-ffacbe",
  "org.scalablytyped" %%% "workbox-streams" % "4.3-dt-20200515Z-b1ee98")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
