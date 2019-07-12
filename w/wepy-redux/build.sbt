organization := "org.scalablytyped"
name := "wepy-redux"
version := "1.7-dt-20181019Z-b8cdb0"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "redux" % "4.0.4-d7698e",
  "org.scalablytyped" %%% "std" % "3.5-983486",
  "org.scalablytyped" %%% "wepy" % "1.7-dt-20190212Z-2d4d86")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        