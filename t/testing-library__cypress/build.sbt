organization := "org.scalablytyped"
name := "testing-library__cypress"
version := "5.0-dt-20200401Z-652d59"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "cypress" % "4.6.0-9c6b5e",
  "org.scalablytyped" %%% "eventemitter2" % "6.4.1-4bcdfe",
  "org.scalablytyped" %%% "moment" % "2.26.0-76666d",
  "org.scalablytyped" %%% "pretty-format" % "25.5.0-783fc8",
  "org.scalablytyped" %%% "sinonjs__fake-timers" % "6.0-dt-20200331Z-c55c07",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20200515Z-b4597c",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb",
  "org.scalablytyped" %%% "testing-library__dom" % "7.0-dt-20200423Z-b4f50f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
