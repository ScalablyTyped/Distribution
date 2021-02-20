organization := "org.scalablytyped"
name := "testing-library__vue"
version := "5.0-dt-20200723Z-5c1815"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "aria-query" % "4.2-dt-20200628Z-90fa24",
  "org.scalablytyped" %%% "pretty-format" % "26.6.2-ae0e1a",
  "org.scalablytyped" %%% "std" % "4.1-40053c",
  "org.scalablytyped" %%% "testing-library__dom" % "7.28.1-4c83ff",
  "org.scalablytyped" %%% "vue" % "2.6.12-9e9655",
  "org.scalablytyped" %%% "vue-router" % "3.4.9-2178b6",
  "org.scalablytyped" %%% "vue__test-utils" % "1.1.1-37a8cb",
  "org.scalablytyped" %%% "vuex" % "3.5.1-3ba3b1")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
