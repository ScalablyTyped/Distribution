organization := "org.scalablytyped"
name := "testing-library__vue"
version := "5.0-dt-20200723Z-f8198a"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "aria-query" % "4.2-dt-20200628Z-cd3cca",
  "org.scalablytyped" %%% "pretty-format" % "26.6.2-32b293",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab",
  "org.scalablytyped" %%% "testing-library__dom" % "7.28.1-0999da",
  "org.scalablytyped" %%% "vue" % "2.6.12-a5f695",
  "org.scalablytyped" %%% "vue-router" % "3.4.9-de0eff",
  "org.scalablytyped" %%% "vue__test-utils" % "1.1.1-6f2ef7",
  "org.scalablytyped" %%% "vuex" % "3.5.1-429685")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
