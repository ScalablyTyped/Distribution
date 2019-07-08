organization := "org.scalablytyped"
name := "uifabric__icons"
version := "6.5.3-0f4935"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.5-523284",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-c6e514",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190703Z-5fe923",
  "org.scalablytyped" %%% "std" % "3.5-983486",
  "org.scalablytyped" %%% "uifabric__merge-styles" % "6.19.2-120e7a",
  "org.scalablytyped" %%% "uifabric__styling" % "6.50.1-77c9c0",
  "org.scalablytyped" %%% "uifabric__utilities" % "6.41.4-fc5b66")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        