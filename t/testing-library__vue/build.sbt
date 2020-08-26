organization := "org.scalablytyped"
name := "testing-library__vue"
version := "5.0-dt-20200723Z-97cca2"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "aria-query" % "4.2-dt-20200628Z-4b589c",
  "org.scalablytyped" %%% "pretty-format" % "26.2.0-662c48",
  "org.scalablytyped" %%% "std" % "3.9-bafc13",
  "org.scalablytyped" %%% "testing-library__dom" % "7.21.7-65f288",
  "org.scalablytyped" %%% "vue" % "2.6.11-238d86",
  "org.scalablytyped" %%% "vue-router" % "3.3.4-faf8cd",
  "org.scalablytyped" %%% "vuex" % "3.5.1-30882e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
