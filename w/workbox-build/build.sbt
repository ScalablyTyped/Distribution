organization := "org.scalablytyped"
name := "workbox-build"
version := "6.5.4-395e57"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230511Z-0320fc",
  "org.scalablytyped" %%% "source-map" % "0.7.4-e1e422",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "type-fest" % "3.10.0-9a1e17",
  "org.scalablytyped" %%% "workbox-background-sync" % "6.5.4-0fd36c",
  "org.scalablytyped" %%% "workbox-broadcast-update" % "6.5.4-c86e23",
  "org.scalablytyped" %%% "workbox-cacheable-response" % "6.5.4-32c176",
  "org.scalablytyped" %%% "workbox-core" % "6.5.4-efa277",
  "org.scalablytyped" %%% "workbox-expiration" % "6.5.4-a473c1",
  "org.scalablytyped" %%% "workbox-google-analytics" % "6.5.4-4890e8",
  "org.scalablytyped" %%% "workbox-routing" % "6.5.4-fc413d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
