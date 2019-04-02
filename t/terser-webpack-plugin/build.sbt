organization := "org.scalablytyped"
name := "terser-webpack-plugin"
version := "1.2-dt-20190214Z-63e6f5"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-6f800f",
  "org.scalablytyped" %%% "commander" % "2.19.0-4db880",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190330Z-7c1cfd",
  "org.scalablytyped" %%% "source-map" % "0.7.3-1b6210",
  "org.scalablytyped" %%% "source-map-support" % "0.5-dt-20190224Z-1843b4",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-20a77d",
  "org.scalablytyped" %%% "terser" % "3.17.0-6d9af4",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-c8c046",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20190316Z-c230d0")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        