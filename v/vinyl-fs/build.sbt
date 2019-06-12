organization := "org.scalablytyped"
name := "vinyl-fs"
version := "2.4-dt-20190228Z-8cc7bc"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-28fe34",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20190322Z-b62ee0",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-384d13",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190611Z-76ef23",
  "org.scalablytyped" %%% "std" % "3.5-c5d119",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20190409Z-fc6086")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        