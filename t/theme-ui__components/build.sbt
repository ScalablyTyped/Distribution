organization := "org.scalablytyped"
name := "theme-ui__components"
version := "0.2-dt-20200515Z-3a1049"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.9-03f85a",
  "org.scalablytyped" %%% "emotion__core" % "10.0.28-56488c",
  "org.scalablytyped" %%% "emotion__serialize" % "0.11.15-afc453",
  "org.scalablytyped" %%% "emotion__styled-base" % "10.0.28-57bf2c",
  "org.scalablytyped" %%% "emotion__utils" % "0.11.3-74adc5",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-4fb81d",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200515Z-0f8114",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb",
  "org.scalablytyped" %%% "styled-system" % "5.1-dt-20200309Z-951f62")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
