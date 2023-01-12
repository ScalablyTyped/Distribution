organization := "org.scalablytyped"
name := "workbox-sw"
version := "4.3-dt-20220624Z-699735"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb",
  "org.scalablytyped" %%% "workbox-background-sync" % "4.3-dt-20211202Z-fdaa7c",
  "org.scalablytyped" %%% "workbox-broadcast-update" % "4.3-dt-20211202Z-9f0480",
  "org.scalablytyped" %%% "workbox-cacheable-response" % "4.3-dt-20211202Z-1f61b6",
  "org.scalablytyped" %%% "workbox-core" % "4.3-dt-20211202Z-8fc601",
  "org.scalablytyped" %%% "workbox-expiration" % "4.3-dt-20211202Z-5228d9",
  "org.scalablytyped" %%% "workbox-google-analytics" % "4.3-dt-20211202Z-20cdeb",
  "org.scalablytyped" %%% "workbox-precaching" % "4.3-dt-20211202Z-e21e9b",
  "org.scalablytyped" %%% "workbox-range-requests" % "4.3-dt-20211202Z-e3173d",
  "org.scalablytyped" %%% "workbox-routing" % "4.3-dt-20211202Z-741ee8",
  "org.scalablytyped" %%% "workbox-strategies" % "4.3-dt-20211202Z-c9575c",
  "org.scalablytyped" %%% "workbox-streams" % "4.3-dt-20211202Z-c12da3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
