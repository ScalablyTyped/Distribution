organization := "org.scalablytyped"
name := "workbox-sw"
version := "4.3-dt-20220624Z-e68d1e"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "std" % "4.8-958c79",
  "org.scalablytyped" %%% "workbox-background-sync" % "4.3-dt-20211202Z-4a6d16",
  "org.scalablytyped" %%% "workbox-broadcast-update" % "4.3-dt-20211202Z-5d055a",
  "org.scalablytyped" %%% "workbox-cacheable-response" % "4.3-dt-20211202Z-df7823",
  "org.scalablytyped" %%% "workbox-core" % "4.3-dt-20211202Z-a01ee2",
  "org.scalablytyped" %%% "workbox-expiration" % "4.3-dt-20211202Z-052b90",
  "org.scalablytyped" %%% "workbox-google-analytics" % "4.3-dt-20211202Z-1de09b",
  "org.scalablytyped" %%% "workbox-precaching" % "4.3-dt-20211202Z-15756d",
  "org.scalablytyped" %%% "workbox-range-requests" % "4.3-dt-20211202Z-b9c938",
  "org.scalablytyped" %%% "workbox-routing" % "4.3-dt-20211202Z-e0b1f8",
  "org.scalablytyped" %%% "workbox-strategies" % "4.3-dt-20211202Z-8d9d84",
  "org.scalablytyped" %%% "workbox-streams" % "4.3-dt-20211202Z-c6af2b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
