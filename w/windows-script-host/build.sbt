organization := "org.scalablytyped"
name := "windows-script-host"
version := "5.8-dt-20201002Z-d8bf3d"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "activex-interop" % "0.0-dt-20200515Z-c4a496",
  "org.scalablytyped" %%% "activex-iwshruntimelibrary" % "0.0-dt-20200515Z-739e3e",
  "org.scalablytyped" %%% "std" % "4.1-2f6855")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
