organization := "org.scalablytyped"
name := "workbox-sw"
version := "4.3-dt-20220624Z-2a41d5"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "std" % "4.8-686d1d",
  "org.scalablytyped" %%% "workbox-background-sync" % "4.3-dt-20211202Z-5f7442",
  "org.scalablytyped" %%% "workbox-broadcast-update" % "4.3-dt-20211202Z-e27516",
  "org.scalablytyped" %%% "workbox-cacheable-response" % "4.3-dt-20211202Z-6a7337",
  "org.scalablytyped" %%% "workbox-core" % "4.3-dt-20211202Z-2bbcad",
  "org.scalablytyped" %%% "workbox-expiration" % "4.3-dt-20211202Z-924b20",
  "org.scalablytyped" %%% "workbox-google-analytics" % "4.3-dt-20211202Z-f884aa",
  "org.scalablytyped" %%% "workbox-precaching" % "4.3-dt-20211202Z-522a49",
  "org.scalablytyped" %%% "workbox-range-requests" % "4.3-dt-20211202Z-895b51",
  "org.scalablytyped" %%% "workbox-routing" % "4.3-dt-20211202Z-edc25a",
  "org.scalablytyped" %%% "workbox-strategies" % "4.3-dt-20211202Z-3fe16d",
  "org.scalablytyped" %%% "workbox-streams" % "4.3-dt-20211202Z-858e36")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
