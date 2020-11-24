organization := "org.scalablytyped"
name := "testing-library__vue"
version := "5.0-dt-20200723Z-cd220d"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "aria-query" % "4.2-dt-20200628Z-0a7d52",
  "org.scalablytyped" %%% "pretty-format" % "26.6.2-bba0e1",
  "org.scalablytyped" %%% "std" % "4.1-c651d0",
  "org.scalablytyped" %%% "testing-library__dom" % "7.28.1-602aaf",
  "org.scalablytyped" %%% "vue" % "2.6.12-307c4c",
  "org.scalablytyped" %%% "vue-router" % "3.4.9-b8bc58",
  "org.scalablytyped" %%% "vue__test-utils" % "1.1.1-18f6a6",
  "org.scalablytyped" %%% "vuex" % "3.5.1-70b2cd")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
