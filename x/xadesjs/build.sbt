organization := "org.scalablytyped"
name := "xadesjs"
version := "2.0.13-766523"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "asn1js" % "0.0-unknown-dt-20180214Z-cc25da",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2aa425",
  "org.scalablytyped" %%% "pkijs" % "0.0-unknown-dt-20180214Z-23a738",
  "org.scalablytyped" %%% "pvutils" % "0.0-unknown-dt-20180214Z-964612",
  "org.scalablytyped" %%% "std" % "3.2.2-f3cc98",
  "org.scalablytyped" %%% "tslib" % "1.9.3-d3fc19",
  "org.scalablytyped" %%% "xml-core" % "1.0.15-3a7c2d",
  "org.scalablytyped" %%% "xmldsigjs" % "2.0.22-ed6110")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        