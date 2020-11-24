organization := "org.scalablytyped"
name := "tensorflow__tfjs"
version := "2.7.0-67cf2c"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "std" % "4.1-c651d0",
  "org.scalablytyped" %%% "tensorflow__tfjs-converter" % "2.7.0-6c6178",
  "org.scalablytyped" %%% "tensorflow__tfjs-core" % "2.7.0-95fdcf",
  "org.scalablytyped" %%% "tensorflow__tfjs-data" % "2.7.0-7febc0",
  "org.scalablytyped" %%% "tensorflow__tfjs-layers" % "2.7.0-25e064")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
