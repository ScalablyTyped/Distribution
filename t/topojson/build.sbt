organization := "org.scalablytyped"
name := "topojson"
version := "3.2-dt-20180414Z-028c6f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20190212Z-8f5374",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "topojson-client" % "3.0-dt-20180414Z-6bd361",
  "org.scalablytyped" %%% "topojson-simplify" % "3.0-dt-20180414Z-dfdfd8",
  "org.scalablytyped" %%% "topojson-specification" % "1.0-dt-20190213Z-d8836d")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        