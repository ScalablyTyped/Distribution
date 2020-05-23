organization := "org.scalablytyped"
name := "tensorflow__tfjs"
version := "1.7.4-828416"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb",
  "org.scalablytyped" %%% "tensorflow__tfjs-converter" % "1.7.4-5a74c7",
  "org.scalablytyped" %%% "tensorflow__tfjs-core" % "1.7.4-36ec2a",
  "org.scalablytyped" %%% "tensorflow__tfjs-data" % "1.7.4-ee709f",
  "org.scalablytyped" %%% "tensorflow__tfjs-layers" % "1.7.4-f7c6c3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
