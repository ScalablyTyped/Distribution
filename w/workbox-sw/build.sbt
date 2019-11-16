organization := "org.scalablytyped"
name := "workbox-sw"
version := "4.3-dt-20191115Z-81ecee"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf",
  "org.scalablytyped" %%% "workbox-background-sync" % "4.3-dt-20191115Z-c103b5",
  "org.scalablytyped" %%% "workbox-broadcast-update" % "4.3-dt-20191115Z-f8167f",
  "org.scalablytyped" %%% "workbox-cacheable-response" % "4.3-dt-20191115Z-b477f4",
  "org.scalablytyped" %%% "workbox-core" % "4.3-dt-20191115Z-4f3d14",
  "org.scalablytyped" %%% "workbox-expiration" % "4.3-dt-20191115Z-9ac768",
  "org.scalablytyped" %%% "workbox-google-analytics" % "4.3-dt-20191115Z-b2b333",
  "org.scalablytyped" %%% "workbox-precaching" % "4.3-dt-20191115Z-041bce",
  "org.scalablytyped" %%% "workbox-range-requests" % "4.3-dt-20191115Z-254705",
  "org.scalablytyped" %%% "workbox-routing" % "4.3-dt-20191115Z-96f2ff",
  "org.scalablytyped" %%% "workbox-strategies" % "4.3-dt-20191115Z-6fa911",
  "org.scalablytyped" %%% "workbox-streams" % "4.3-dt-20191115Z-73bd67")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        