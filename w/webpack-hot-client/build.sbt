organization := "org.scalablytyped"
name := "webpack-hot-client"
version := "4.0-dt-20180621Z-889cfe"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-63350e",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190325Z-000e7b",
  "org.scalablytyped" %%% "source-map" % "0.7.3-aac742",
  "org.scalablytyped" %%% "std" % "3.3-14e863",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-c2e5ed",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-5fcf02",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20190316Z-1cc7c8")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        