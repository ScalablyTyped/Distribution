organization := "org.scalablytyped"
name := "testing-library__vue"
version := "2.0-dt-20190816Z-c01774"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "pretty-format" % "24.9.0-defaef",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a",
  "org.scalablytyped" %%% "testing-library__dom" % "6.10-dt-20191101Z-1b2880",
  "org.scalablytyped" %%% "vue" % "2.6.10-887a62",
  "org.scalablytyped" %%% "vue-router" % "3.1.3-4b4872",
  "org.scalablytyped" %%% "vuex" % "3.1.1-9746d7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        