organization := "org.scalablytyped"
name := "vfile-location"
version := "2.0-dt-20181127Z-239719"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190502Z-d681c7",
  "org.scalablytyped" %%% "std" % "3.4-495f93",
  "org.scalablytyped" %%% "unist" % "2.0-dt-20190213Z-646681",
  "org.scalablytyped" %%% "vfile" % "3.0-dt-20181205Z-d8e93c",
  "org.scalablytyped" %%% "vfile-message" % "1.0-dt-20181205Z-502b7d")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        