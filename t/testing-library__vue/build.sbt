organization := "org.scalablytyped"
name := "testing-library__vue"
version := "2.0-dt-20200629Z-7498cf"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "pretty-format" % "25.5.0-c99381",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8",
  "org.scalablytyped" %%% "testing-library__dom" % "7.19.0-a620b1",
  "org.scalablytyped" %%% "vue" % "2.6.11-cf582f",
  "org.scalablytyped" %%% "vue-router" % "3.3.4-8a52d7",
  "org.scalablytyped" %%% "vuex" % "3.5.1-e02da3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
