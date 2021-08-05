organization := "org.scalablytyped"
name := "testing-library__vue"
version := "5.0-dt-20200723Z-416d01"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "aria-query" % "4.2-dt-20200628Z-d252b1",
  "org.scalablytyped" %%% "pretty-format" % "26.6.2-548d04",
  "org.scalablytyped" %%% "std" % "4.1-2f6855",
  "org.scalablytyped" %%% "testing-library__dom" % "7.28.1-ba3bff",
  "org.scalablytyped" %%% "vue" % "2.6.12-c3b74c",
  "org.scalablytyped" %%% "vue-router" % "3.4.9-8731c5",
  "org.scalablytyped" %%% "vue__test-utils" % "1.1.1-543328",
  "org.scalablytyped" %%% "vuex" % "3.5.1-617efc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
