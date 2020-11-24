organization := "org.scalablytyped"
name := "theme-ui"
version := "0.3-dt-20200925Z-0eb3b9"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.14-fa358f",
  "org.scalablytyped" %%% "emotion__core" % "10.1.1-cc8fad",
  "org.scalablytyped" %%% "emotion__serialize" % "0.11.16-ff7814",
  "org.scalablytyped" %%% "emotion__styled-base" % "10.0.31-f0b0d1",
  "org.scalablytyped" %%% "emotion__utils" % "0.11.3-e63227",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-0012d8",
  "org.scalablytyped" %%% "react" % "17.0-dt-20201121Z-cfb347",
  "org.scalablytyped" %%% "std" % "4.1-c651d0",
  "org.scalablytyped" %%% "styled-system" % "5.1-dt-20201028Z-d40705",
  "org.scalablytyped" %%% "styled-system__css" % "5.0-dt-20200925Z-abfc1a",
  "org.scalablytyped" %%% "theme-ui__components" % "0.2-dt-20200925Z-f54ebc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
