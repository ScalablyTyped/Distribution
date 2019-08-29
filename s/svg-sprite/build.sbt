organization := "org.scalablytyped"
name := "svg-sprite"
version := "0.0-unknown-dt-20190322Z-ca56d6"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "logform" % "1.2-dt-20180214Z-a2ed41",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190820Z-c250b3",
  "org.scalablytyped" %%% "std" % "3.6-c16502",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20190409Z-a049d5",
  "org.scalablytyped" %%% "winston" % "3.2.1-076785",
  "org.scalablytyped" %%% "winston-transport" % "4.3.0-b28bfe")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        