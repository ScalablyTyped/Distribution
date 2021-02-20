organization := "org.scalablytyped"
name := "theme-ui"
version := "0.3-dt-20200925Z-270ce0"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "csstype" % "2.6.14-b4f267",
  "org.scalablytyped" %%% "emotion__core" % "10.1.1-2311cd",
  "org.scalablytyped" %%% "emotion__serialize" % "0.11.16-65a8a4",
  "org.scalablytyped" %%% "emotion__styled-base" % "10.0.31-dde0c8",
  "org.scalablytyped" %%% "emotion__utils" % "0.11.3-2c7f18",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-7dc507",
  "org.scalablytyped" %%% "react" % "17.0-dt-20201121Z-9253ae",
  "org.scalablytyped" %%% "std" % "4.1-40053c",
  "org.scalablytyped" %%% "styled-system" % "5.1-dt-20201028Z-d9774e",
  "org.scalablytyped" %%% "styled-system__css" % "5.0-dt-20200925Z-005fe1",
  "org.scalablytyped" %%% "theme-ui__components" % "0.2-dt-20200925Z-caea86")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
