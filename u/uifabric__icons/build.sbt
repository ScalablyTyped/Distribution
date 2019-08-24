organization := "org.scalablytyped"
name := "uifabric__icons"
version := "7.1.2-ac950f"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-c240ab",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-f929bc",
  "org.scalablytyped" %%% "react" % "16.9-dt-20190815Z-847c1a",
  "org.scalablytyped" %%% "std" % "3.5-cd493c",
  "org.scalablytyped" %%% "uifabric__merge-styles" % "7.4.1-d5ce81",
  "org.scalablytyped" %%% "uifabric__styling" % "7.6.1-2116c2",
  "org.scalablytyped" %%% "uifabric__utilities" % "7.0.8-06b3d2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        