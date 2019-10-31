organization := "org.scalablytyped"
name := "svg-sprite"
version := "0.0-unknown-dt-20190322Z-d55d80"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "logform" % "2.1.2-8f8356",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191030Z-4bf573",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20190409Z-4f91ba",
  "org.scalablytyped" %%% "winston" % "3.2.1-7c4584",
  "org.scalablytyped" %%% "winston-transport" % "4.3.0-6285eb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        