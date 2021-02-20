organization := "org.scalablytyped"
name := "tensorflow__tfjs"
version := "2.7.0-f63f32"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "std" % "4.1-40053c",
  "org.scalablytyped" %%% "tensorflow__tfjs-converter" % "2.7.0-0e30de",
  "org.scalablytyped" %%% "tensorflow__tfjs-core" % "2.7.0-c5e67d",
  "org.scalablytyped" %%% "tensorflow__tfjs-data" % "2.7.0-ede203",
  "org.scalablytyped" %%% "tensorflow__tfjs-layers" % "2.7.0-be72ba")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
