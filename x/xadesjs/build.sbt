organization := "org.scalablytyped"
name := "xadesjs"
version := "2.0.14-150c98"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "asn1js" % "0.0-unknown-dt-20180214Z-db4bfd",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-40209e",
  "org.scalablytyped" %%% "pkijs" % "0.0-unknown-dt-20180214Z-3b696f",
  "org.scalablytyped" %%% "pvutils" % "0.0-unknown-dt-20180214Z-b212d4",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1",
  "org.scalablytyped" %%% "tslib" % "1.9.3-688770",
  "org.scalablytyped" %%% "xml-core" % "1.0.15-baec0c",
  "org.scalablytyped" %%% "xmldsigjs" % "2.0.22-dcc542")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        