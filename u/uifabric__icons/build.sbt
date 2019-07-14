organization := "org.scalablytyped"
name := "uifabric__icons"
version := "7.1.0-666856"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-c945ed",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-c6e514",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190703Z-55594c",
  "org.scalablytyped" %%% "std" % "3.5-983486",
  "org.scalablytyped" %%% "uifabric__merge-styles" % "7.1.1-3ee070",
  "org.scalablytyped" %%% "uifabric__styling" % "7.2.0-278bed",
  "org.scalablytyped" %%% "uifabric__utilities" % "7.0.6-b97da9")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        