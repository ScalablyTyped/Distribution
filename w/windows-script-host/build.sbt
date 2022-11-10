organization := "org.scalablytyped"
name := "windows-script-host"
version := "5.8-dt-20211202Z-c20b61"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "activex-interop" % "0.0-dt-20211202Z-c58ac3",
  "org.scalablytyped" %%% "activex-iwshruntimelibrary" % "0.0-dt-20220705Z-5c4a08",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
