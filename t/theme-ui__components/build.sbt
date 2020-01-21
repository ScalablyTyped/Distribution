organization := "org.scalablytyped"
name := "theme-ui__components"
version := "0.2-dt-20191226Z-f31502"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-dcd929",
  "org.scalablytyped" %%% "emotion__core" % "10.0.20-5dcb4b",
  "org.scalablytyped" %%% "emotion__serialize" % "0.11.11-265421",
  "org.scalablytyped" %%% "emotion__styled-base" % "10.0.19-a56594",
  "org.scalablytyped" %%% "emotion__utils" % "0.11.2-c8c047",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-78233f",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191220Z-0e1ae9",
  "org.scalablytyped" %%% "std" % "3.7-96076c",
  "org.scalablytyped" %%% "styled-system" % "5.1-dt-20191118Z-5f6bc0",
  "org.scalablytyped" %%% "styled-system__css" % "5.0-dt-20191115Z-786b0c",
  "org.scalablytyped" %%% "theme-ui" % "0.2-dt-20200106Z-405081")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        