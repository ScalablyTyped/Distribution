organization := "org.scalablytyped"
name := "update-notifier"
version := "5.0-dt-20200930Z-217056"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "boxen" % "4.2.0-93d656",
  "org.scalablytyped" %%% "cli-boxes" % "2.2.1-6a7eac",
  "org.scalablytyped" %%% "configstore" % "4.0-dt-20200515Z-be1e19",
  "org.scalablytyped" %%% "std" % "4.1-c651d0",
  "org.scalablytyped" %%% "type-fest" % "0.8.1-166c23")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
