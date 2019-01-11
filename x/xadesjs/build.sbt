organization := "org.scalablytyped"
name := "xadesjs"
version := "2.0.13-b5e1d7"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "asn1js" % "0.0-unknown-dt-20180214Z-2a293e",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2be335",
  "org.scalablytyped" %%% "pkijs" % "0.0-unknown-dt-20180214Z-45acc5",
  "org.scalablytyped" %%% "pvutils" % "0.0-unknown-dt-20180214Z-f98b69",
  "org.scalablytyped" %%% "std" % "3.2.2-2926f1",
  "org.scalablytyped" %%% "tslib" % "1.9.3-cc9481",
  "org.scalablytyped" %%% "xml-core" % "1.0.15-6083db",
  "org.scalablytyped" %%% "xmldsigjs" % "2.0.22-b36034")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        