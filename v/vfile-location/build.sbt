organization := "org.scalablytyped"
name := "vfile-location"
version := "2.0-dt-20181127Z-32fb21"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190409Z-512fe2",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "unist" % "2.0-dt-20190213Z-3a3040",
  "org.scalablytyped" %%% "vfile" % "3.0-dt-20181205Z-9941fd",
  "org.scalablytyped" %%% "vfile-message" % "1.0-dt-20181205Z-ed0864")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        