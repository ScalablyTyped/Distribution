organization := "org.scalablytyped"
name := "webpack-dotenv-plugin"
version := "2.0-dt-20180306Z-4c44e9"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20180214Z-3be82b",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-7438ae",
  "org.scalablytyped" %%% "source-map" % "0.7.3-1d8315",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20180713Z-1d4d44",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-280313",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20190116Z-1ebcb9")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        