organization := "org.scalablytyped"
name := "xadesjs"
version := "2.0.14-0599c0"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "asn1js" % "0.0-unknown-dt-20180214Z-96c2c1",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190213Z-0d969a",
  "org.scalablytyped" %%% "pkijs" % "0.0-unknown-dt-20180214Z-d8c0ab",
  "org.scalablytyped" %%% "pvutils" % "0.0-unknown-dt-20180214Z-08c283",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "tslib" % "1.9.3-2d26d9",
  "org.scalablytyped" %%% "xml-core" % "1.0.15-c55107",
  "org.scalablytyped" %%% "xmldsigjs" % "2.0.22-a61128")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        