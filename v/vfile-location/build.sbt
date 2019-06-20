organization := "org.scalablytyped"
name := "vfile-location"
version := "2.0-dt-20181127Z-c7ab14"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190611Z-b8909f",
  "org.scalablytyped" %%% "std" % "3.5-d4a303",
  "org.scalablytyped" %%% "unist" % "2.0-dt-20190213Z-d7fcd2",
  "org.scalablytyped" %%% "vfile" % "3.0-dt-20181205Z-fc79cf",
  "org.scalablytyped" %%% "vfile-message" % "1.0-dt-20181205Z-41a5f0")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        