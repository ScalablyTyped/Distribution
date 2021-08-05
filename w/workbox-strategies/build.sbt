organization := "org.scalablytyped"
name := "workbox-strategies"
version := "4.3-dt-20200515Z-4a86b6"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "std" % "4.1-2f6855",
  "org.scalablytyped" %%% "workbox-core" % "4.3-dt-20200515Z-677aa8",
  "org.scalablytyped" %%% "workbox-routing" % "4.3-dt-20201002Z-0b2716")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
