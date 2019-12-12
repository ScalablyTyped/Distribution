organization := "org.scalablytyped"
name := "styled-react-modal"
version := "1.2-dt-20190506Z-271bcb"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-a93afc",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-5cddf8",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191126Z-3d1d47",
  "org.scalablytyped" %%% "react-native" % "0.60-dt-20191121Z-cb9adb",
  "org.scalablytyped" %%% "std" % "3.7-1d724d",
  "org.scalablytyped" %%% "styled-components" % "4.4-dt-20191126Z-ec1b86")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        