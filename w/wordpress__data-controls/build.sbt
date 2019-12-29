organization := "org.scalablytyped"
name := "wordpress__data-controls"
version := "1.0-dt-20191008Z-740c4b"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "redux" % "4.0.5-174ff7",
  "org.scalablytyped" %%% "std" % "3.7-953338",
  "org.scalablytyped" %%% "wordpress__api-fetch" % "3.2-dt-20190726Z-6505d8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        