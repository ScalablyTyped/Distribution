organization := "org.scalablytyped"
name := "wordpress__media-utils"
version := "0.2-dt-20200925Z-f7daf2"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "csstype" % "2.6.14-b4f267",
  "org.scalablytyped" %%% "downshift" % "6.0.6-54c5a5",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-7dc507",
  "org.scalablytyped" %%% "re-resizable" % "6.6.1-65adff",
  "org.scalablytyped" %%% "react" % "17.0-dt-20201121Z-9253ae",
  "org.scalablytyped" %%% "react-autosize-textarea" % "7.1.0-7fbc44",
  "org.scalablytyped" %%% "react-dom" % "17.0-dt-20201120Z-3e906f",
  "org.scalablytyped" %%% "std" % "4.1-40053c",
  "org.scalablytyped" %%% "tinycolor2" % "1.4-dt-20201002Z-687f67",
  "org.scalablytyped" %%% "wordpress__block-editor" % "2.2-dt-20200925Z-358eff",
  "org.scalablytyped" %%% "wordpress__blocks" % "6.4-dt-20201013Z-f7a078",
  "org.scalablytyped" %%% "wordpress__components" % "9.8-dt-20201104Z-148799",
  "org.scalablytyped" %%% "wordpress__element" % "2.18.0-033d1a",
  "org.scalablytyped" %%% "wordpress__notices" % "1.5-dt-20200925Z-a8bdef",
  "org.scalablytyped" %%% "wordpress__rich-text" % "3.4-dt-20200925Z-891f5e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
