organization := "org.scalablytyped"
name := "webcola"
version := "3.4.0-7f19a0"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "d3-dispatch" % "1.0-dt-20200707Z-0f600a",
  "org.scalablytyped" %%% "d3-drag" % "1.2-dt-20200515Z-1185cd",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20200707Z-7b7f3a",
  "org.scalablytyped" %%% "d3-timer" % "1.0-dt-20200515Z-c44d09",
  "org.scalablytyped" %%% "std" % "3.9-bafc13")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
