organization := "org.scalablytyped"
name := "vision"
version := "5.3-dt-20190219Z-67dfa1"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181116Z-bd3199",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190219Z-6773cd",
  "org.scalablytyped" %%% "handlebars" % "4.1.1-069f77",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20190212Z-9f27f4",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-f14200",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190212Z-86a92a",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-ea22a6",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20190322Z-dedbe7",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190330Z-7c1cfd",
  "org.scalablytyped" %%% "optimist" % "0.0-unknown-dt-20190322Z-87cc67",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20190322Z-e48ffc",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-7f8f87",
  "org.scalablytyped" %%% "source-map" % "0.7.3-1b6210",
  "org.scalablytyped" %%% "std" % "3.4-d52857")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        