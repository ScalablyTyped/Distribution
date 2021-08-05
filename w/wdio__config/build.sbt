organization := "org.scalablytyped"
name := "wdio__config"
version := "6.9.0-8489d1"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "got" % "9.6-dt-20200515Z-fcaff1",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-e00132",
  "org.scalablytyped" %%% "std" % "4.1-2f6855",
  "org.scalablytyped" %%% "tough-cookie" % "4.0-dt-20201002Z-721f24",
  "org.scalablytyped" %%% "wdio__protocols" % "6.8.0-f1822d",
  "org.scalablytyped" %%% "webdriver" % "6.9.1-0038ad")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
