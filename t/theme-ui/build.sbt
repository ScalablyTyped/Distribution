organization := "org.scalablytyped"
name := "theme-ui"
version := "0.3-dt-20200130Z-81aa04"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-ffacbb",
  "org.scalablytyped" %%% "emotion__core" % "10.0.20-ea664a",
  "org.scalablytyped" %%% "emotion__serialize" % "0.11.11-fdbdaf",
  "org.scalablytyped" %%% "emotion__styled-base" % "10.0.19-66f3fb",
  "org.scalablytyped" %%% "emotion__utils" % "0.11.2-70bad0",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-05a52c",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200122Z-b17eee",
  "org.scalablytyped" %%% "std" % "3.7-1b8369",
  "org.scalablytyped" %%% "styled-system" % "5.1-dt-20200130Z-b30257",
  "org.scalablytyped" %%% "styled-system__css" % "5.0-dt-20191115Z-1cc3fa",
  "org.scalablytyped" %%% "theme-ui__components" % "0.2-dt-20200210Z-a0906d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
