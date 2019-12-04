organization := "org.scalablytyped"
name := "workbox-sw"
version := "4.3-dt-20191115Z-f0e1f8"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "std" % "3.7-1d724d",
  "org.scalablytyped" %%% "workbox-background-sync" % "4.3-dt-20191126Z-bdb498",
  "org.scalablytyped" %%% "workbox-broadcast-update" % "4.3-dt-20191126Z-c2f5c5",
  "org.scalablytyped" %%% "workbox-cacheable-response" % "4.3-dt-20191126Z-5820a9",
  "org.scalablytyped" %%% "workbox-core" % "4.3-dt-20191126Z-1d8b68",
  "org.scalablytyped" %%% "workbox-expiration" % "4.3-dt-20191126Z-397089",
  "org.scalablytyped" %%% "workbox-google-analytics" % "4.3-dt-20191126Z-d23a08",
  "org.scalablytyped" %%% "workbox-precaching" % "4.3-dt-20191126Z-ea0ec2",
  "org.scalablytyped" %%% "workbox-range-requests" % "4.3-dt-20191126Z-543fce",
  "org.scalablytyped" %%% "workbox-routing" % "4.3-dt-20191126Z-78b1a8",
  "org.scalablytyped" %%% "workbox-strategies" % "4.3-dt-20191126Z-5648c9",
  "org.scalablytyped" %%% "workbox-streams" % "4.3-dt-20191126Z-51a6bd")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        