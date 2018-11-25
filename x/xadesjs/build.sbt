organization := "com.scalablytyped"
name := "xadesjs"
version := "2.0.13-d05fb7"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "asn1js" % "0.0-unknown-dt-20180910Z-bee995",
  "com.scalablytyped" %%% "events" % "1.2-dt-20180910Z-abe6d1",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181121Z-913134",
  "com.scalablytyped" %%% "pkijs" % "0.0-unknown-dt-20180910Z-6a164e",
  "com.scalablytyped" %%% "pvutils" % "0.0-unknown-dt-20180910Z-13a9ef",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "com.scalablytyped" %%% "tslib" % "1.9.3-224f5a",
  "com.scalablytyped" %%% "xml-core" % "1.0.15-f716fa",
  "com.scalablytyped" %%% "xmldsigjs" % "2.0.22-b510cb",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        