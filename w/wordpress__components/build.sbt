organization := "org.scalablytyped"
name := "wordpress__components"
version := "9.8-dt-20201104Z-fd6713"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.14-fa358f",
  "org.scalablytyped" %%% "downshift" % "6.0.6-7249ce",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-0012d8",
  "org.scalablytyped" %%% "re-resizable" % "6.6.1-783483",
  "org.scalablytyped" %%% "react" % "17.0-dt-20201121Z-cfb347",
  "org.scalablytyped" %%% "react-dom" % "17.0-dt-20201120Z-3ed86f",
  "org.scalablytyped" %%% "std" % "4.1-c651d0",
  "org.scalablytyped" %%% "tinycolor2" % "1.4-dt-20201002Z-31ea46",
  "org.scalablytyped" %%% "wordpress__element" % "2.18.0-aff613",
  "org.scalablytyped" %%% "wordpress__notices" % "1.5-dt-20200925Z-6d3fa2",
  "org.scalablytyped" %%% "wordpress__rich-text" % "3.4-dt-20200925Z-ec7d95")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
