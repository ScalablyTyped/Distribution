organization := "org.scalablytyped"
name := "webcola"
version := "3.4.0-3fbb16"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "d3-dispatch" % "2.0-dt-20200930Z-58e313",
  "org.scalablytyped" %%% "d3-drag" % "2.0-dt-20201028Z-66cedb",
  "org.scalablytyped" %%% "d3-selection" % "2.0-dt-20201002Z-789400",
  "org.scalablytyped" %%% "d3-timer" % "2.0-dt-20201002Z-64bf88",
  "org.scalablytyped" %%% "std" % "4.1-c651d0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
