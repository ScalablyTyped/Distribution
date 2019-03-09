organization := "org.scalablytyped"
name := "xadesjs"
version := "2.0.14-2a1c04"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "asn1js" % "0.0-unknown-dt-20180214Z-797394",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190307Z-7720a8",
  "org.scalablytyped" %%% "pkijs" % "0.0-unknown-dt-20190217Z-ea648d",
  "org.scalablytyped" %%% "pvutils" % "0.0-unknown-dt-20180214Z-6d5306",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "tslib" % "1.9.3-d28c21",
  "org.scalablytyped" %%% "xml-core" % "1.0.15-d273ac",
  "org.scalablytyped" %%% "xmldsigjs" % "2.0.22-7cac2c")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        