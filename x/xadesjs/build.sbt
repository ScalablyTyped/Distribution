organization := "org.scalablytyped"
name := "xadesjs"
version := "2.0.13-186185"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "asn1js" % "0.0-unknown-dt-20180910Z-26c2d2",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181214Z-702cdc",
  "org.scalablytyped" %%% "pkijs" % "0.0-unknown-dt-20180910Z-bc8c6d",
  "org.scalablytyped" %%% "pvutils" % "0.0-unknown-dt-20180910Z-f27e55",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f",
  "org.scalablytyped" %%% "tslib" % "1.9.3-866b29",
  "org.scalablytyped" %%% "xml-core" % "1.0.15-3cc748",
  "org.scalablytyped" %%% "xmldsigjs" % "2.0.22-d80c51")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        