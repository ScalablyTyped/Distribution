organization := "org.scalablytyped"
name := "workbox-sw"
version := "4.3-dt-20191115Z-c89030"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "std" % "3.7-1d724d",
  "org.scalablytyped" %%% "workbox-background-sync" % "4.3-dt-20191115Z-369543",
  "org.scalablytyped" %%% "workbox-broadcast-update" % "4.3-dt-20191115Z-541613",
  "org.scalablytyped" %%% "workbox-cacheable-response" % "4.3-dt-20191115Z-ae6400",
  "org.scalablytyped" %%% "workbox-core" % "4.3-dt-20191115Z-27d463",
  "org.scalablytyped" %%% "workbox-expiration" % "4.3-dt-20191115Z-d515bc",
  "org.scalablytyped" %%% "workbox-google-analytics" % "4.3-dt-20191115Z-d23a08",
  "org.scalablytyped" %%% "workbox-precaching" % "4.3-dt-20191115Z-220c14",
  "org.scalablytyped" %%% "workbox-range-requests" % "4.3-dt-20191115Z-629e02",
  "org.scalablytyped" %%% "workbox-routing" % "4.3-dt-20191115Z-b05a49",
  "org.scalablytyped" %%% "workbox-strategies" % "4.3-dt-20191115Z-07f7c2",
  "org.scalablytyped" %%% "workbox-streams" % "4.3-dt-20191115Z-898f5c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        