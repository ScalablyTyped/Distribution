organization := "org.scalablytyped"
name := "watchpack"
version := "1.1-dt-20190224Z-2f0189"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-6f800f",
  "org.scalablytyped" %%% "braces" % "2.3-dt-20180214Z-306649",
  "org.scalablytyped" %%% "chokidar" % "2.1.5-789d6a",
  "org.scalablytyped" %%% "glob-parent" % "3.1-dt-20190329Z-819655",
  "org.scalablytyped" %%% "graceful-fs" % "4.1-dt-20190212Z-fddb7c",
  "org.scalablytyped" %%% "inherits" % "0.0-unknown-dt-20190322Z-75670b",
  "org.scalablytyped" %%% "is-binary-path" % "2.0-dt-20180214Z-900f29",
  "org.scalablytyped" %%% "is-glob" % "4.0-dt-20190329Z-4226a6",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190330Z-7c1cfd",
  "org.scalablytyped" %%% "normalize-path" % "3.0-dt-20181225Z-45086b",
  "org.scalablytyped" %%% "path-is-absolute" % "1.0-dt-20180214Z-ae48af",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "upath" % "1.1.2-adf450")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        