organization := "org.scalablytyped"
name := "testing-library__react"
version := "9.1-dt-20190819Z-60a7a6"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-f01b27",
  "org.scalablytyped" %%% "pretty-format" % "20.0-dt-20190212Z-efc2ac",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-f929bc",
  "org.scalablytyped" %%% "react" % "16.9-dt-20190815Z-93079a",
  "org.scalablytyped" %%% "react-dom" % "16.9-dt-20190819Z-d795ac",
  "org.scalablytyped" %%% "std" % "3.5-cd493c",
  "org.scalablytyped" %%% "testing-library__dom" % "6.0-dt-20190819Z-cf2d80")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        