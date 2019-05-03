organization := "org.scalablytyped"
name := "vfile-location"
version := "2.0-dt-20181127Z-b61e1a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190502Z-84ec9f",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2",
  "org.scalablytyped" %%% "unist" % "2.0-dt-20190213Z-bf3e39",
  "org.scalablytyped" %%% "vfile" % "3.0-dt-20181205Z-8efba0",
  "org.scalablytyped" %%% "vfile-message" % "1.0-dt-20181205Z-987952")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        