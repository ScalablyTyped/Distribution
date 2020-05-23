organization := "org.scalablytyped"
name := "testing-library__vue"
version := "2.0-dt-20200401Z-149fb2"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "pretty-format" % "25.5.0-783fc8",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb",
  "org.scalablytyped" %%% "testing-library__dom" % "7.0-dt-20200423Z-b4f50f",
  "org.scalablytyped" %%% "vue" % "2.6.11-597a1e",
  "org.scalablytyped" %%% "vue-router" % "3.2.0-e8ec3c",
  "org.scalablytyped" %%% "vuex" % "3.4.0-5fa1cd")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
