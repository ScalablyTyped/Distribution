organization := "org.scalablytyped"
name := "vfile-location"
version := "2.0-dt-20200515Z-4d07a3"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb",
  "org.scalablytyped" %%% "unist" % "2.0-dt-20190213Z-23ef16",
  "org.scalablytyped" %%% "vfile" % "4.1.1-2dc28e",
  "org.scalablytyped" %%% "vfile-message" % "2.0.4-dea22d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
