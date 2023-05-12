organization := "org.scalablytyped"
name := "workbox-precaching"
version := "6.5.4-7edf37"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "workbox-core" % "6.5.4-efa277",
  "org.scalablytyped" %%% "workbox-routing" % "6.5.4-fc413d",
  "org.scalablytyped" %%% "workbox-strategies" % "6.5.4-f2fe35")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
