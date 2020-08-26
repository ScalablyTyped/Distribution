organization := "org.scalablytyped"
name := "theme-ui"
version := "0.3-dt-20200709Z-30b5c9"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "3.0.2-b6fa26",
  "org.scalablytyped" %%% "emotion__core" % "10.0.28-97ae26",
  "org.scalablytyped" %%% "emotion__serialize" % "0.11.16-103cdd",
  "org.scalablytyped" %%% "emotion__styled-base" % "10.0.31-5071ed",
  "org.scalablytyped" %%% "emotion__utils" % "0.11.3-dada02",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-64dc32",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200711Z-7368c8",
  "org.scalablytyped" %%% "std" % "3.9-bafc13",
  "org.scalablytyped" %%% "styled-system" % "5.1-dt-20200309Z-b4ebf7",
  "org.scalablytyped" %%% "styled-system__css" % "5.0-dt-20200713Z-971d02",
  "org.scalablytyped" %%% "theme-ui__components" % "0.2-dt-20200515Z-67e0ca")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
