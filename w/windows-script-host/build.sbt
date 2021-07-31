organization := "org.scalablytyped"
name := "windows-script-host"
version := "5.8-dt-20201002Z-7e48af"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "activex-interop" % "0.0-dt-20200515Z-18c00d",
  "org.scalablytyped" %%% "activex-iwshruntimelibrary" % "0.0-dt-20200515Z-745213",
  "org.scalablytyped" %%% "std" % "4.1-044efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
