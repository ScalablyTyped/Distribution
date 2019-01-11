organization := "org.scalablytyped"
name := "vision"
version := "5.3-dt-20181022Z-dd66de"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181116Z-f53c96",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20181111Z-1ae318",
  "org.scalablytyped" %%% "hapi" % "17.8-dt-20181212Z-7c2315",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-ed5fb2",
  "org.scalablytyped" %%% "joi" % "14.0-dt-20181211Z-7bcab6",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20180214Z-12a530",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20180214Z-4f5984",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2be335",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20180214Z-adcb2b",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-f0e16c",
  "org.scalablytyped" %%% "std" % "3.2.2-2926f1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        