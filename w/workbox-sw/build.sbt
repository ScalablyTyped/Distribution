organization := "org.scalablytyped"
name := "workbox-sw"
version := "4.3-dt-20191115Z-da1650"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "std" % "3.7-1d724d",
  "org.scalablytyped" %%% "workbox-background-sync" % "4.3-dt-20191126Z-07917b",
  "org.scalablytyped" %%% "workbox-broadcast-update" % "4.3-dt-20191126Z-5ebdf3",
  "org.scalablytyped" %%% "workbox-cacheable-response" % "4.3-dt-20191126Z-9108ed",
  "org.scalablytyped" %%% "workbox-core" % "4.3-dt-20191126Z-27d463",
  "org.scalablytyped" %%% "workbox-expiration" % "4.3-dt-20191126Z-c2558f",
  "org.scalablytyped" %%% "workbox-google-analytics" % "4.3-dt-20191126Z-d23a08",
  "org.scalablytyped" %%% "workbox-precaching" % "4.3-dt-20191126Z-71fc57",
  "org.scalablytyped" %%% "workbox-range-requests" % "4.3-dt-20191126Z-655f3c",
  "org.scalablytyped" %%% "workbox-routing" % "4.3-dt-20191126Z-b05a49",
  "org.scalablytyped" %%% "workbox-strategies" % "4.3-dt-20191126Z-b49df6",
  "org.scalablytyped" %%% "workbox-streams" % "4.3-dt-20191126Z-0f71df")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        