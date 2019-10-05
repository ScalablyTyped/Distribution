organization := "org.scalablytyped"
name := "uifabric__foundation"
version := "7.4.4-32f03a"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-1967d7",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-e54803",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191003Z-cca292",
  "org.scalablytyped" %%% "std" % "3.6-abb6d3",
  "org.scalablytyped" %%% "uifabric__merge-styles" % "7.7.0-3fd0d2",
  "org.scalablytyped" %%% "uifabric__styling" % "7.7.2-513f3f",
  "org.scalablytyped" %%% "uifabric__utilities" % "7.4.0-261f6d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        