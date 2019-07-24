organization := "org.scalablytyped"
name := "wordpress__data-controls"
version := "1.0-dt-20190722Z-3cef29"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "redux" % "4.0.4-d7698e",
  "org.scalablytyped" %%% "std" % "3.5-983486",
  "org.scalablytyped" %%% "wordpress__api-fetch" % "3.2-dt-20190722Z-7c7769")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        