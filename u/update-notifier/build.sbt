organization := "org.scalablytyped"
name := "update-notifier"
version := "5.0-dt-20200930Z-f2888c"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "boxen" % "4.2.0-c8709a",
  "org.scalablytyped" %%% "cli-boxes" % "2.2.1-cc9b86",
  "org.scalablytyped" %%% "configstore" % "4.0-dt-20200515Z-568555",
  "org.scalablytyped" %%% "std" % "4.1-40053c",
  "org.scalablytyped" %%% "type-fest" % "0.8.1-a04c9b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
