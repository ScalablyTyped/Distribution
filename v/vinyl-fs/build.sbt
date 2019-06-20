organization := "org.scalablytyped"
name := "vinyl-fs"
version := "2.4-dt-20190228Z-434315"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-4e7b52",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20190322Z-cbf372",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-e56e4c",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190611Z-b8909f",
  "org.scalablytyped" %%% "std" % "3.5-d4a303",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20190409Z-459738")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        