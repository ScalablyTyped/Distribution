organization := "org.scalablytyped"
name := "svg-sprite"
version := "0.0-unknown-dt-20201002Z-73ca75"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "logform" % "2.2.0-0b1340",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-50d3d9",
  "org.scalablytyped" %%% "std" % "4.1-40053c",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20201002Z-0812a6",
  "org.scalablytyped" %%% "winston" % "3.3.3-68a4f4",
  "org.scalablytyped" %%% "winston-transport" % "4.4.0-18c555")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
