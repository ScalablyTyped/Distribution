organization := "org.scalablytyped"
name := "wordpress__editor"
version := "9.4-dt-20200515Z-383da8"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.9-03f85a",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-4fb81d",
  "org.scalablytyped" %%% "re-resizable" % "6.3.2-299593",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200515Z-0f8114",
  "org.scalablytyped" %%% "react-dom" % "16.9-dt-20200519Z-d20490",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb",
  "org.scalablytyped" %%% "wordpress__api-fetch" % "3.2-dt-20190726Z-829420",
  "org.scalablytyped" %%% "wordpress__block-editor" % "2.2-dt-20200515Z-b7e1fb",
  "org.scalablytyped" %%% "wordpress__blocks" % "6.4-dt-20200515Z-41790b",
  "org.scalablytyped" %%% "wordpress__components" % "8.5-dt-20200427Z-692ad4",
  "org.scalablytyped" %%% "wordpress__core-data" % "2.4-dt-20200515Z-bcd4a0",
  "org.scalablytyped" %%% "wordpress__element" % "2.4-dt-20200427Z-6564fe",
  "org.scalablytyped" %%% "wordpress__media-utils" % "0.2-dt-20200515Z-663416",
  "org.scalablytyped" %%% "wordpress__notices" % "1.5-dt-20200515Z-27d72d",
  "org.scalablytyped" %%% "wordpress__rich-text" % "3.4-dt-20200515Z-779163")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
