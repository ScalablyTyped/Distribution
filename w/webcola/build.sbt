organization := "org.scalablytyped"
name := "webcola"
version := "3.4.0-6207a7"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "d3-dispatch" % "1.0-dt-20200515Z-135437",
  "org.scalablytyped" %%% "d3-drag" % "1.2-dt-20200515Z-7fb01a",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20200515Z-63e92d",
  "org.scalablytyped" %%% "d3-timer" % "1.0-dt-20200515Z-e0fb9b",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
