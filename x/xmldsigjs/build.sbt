organization := "com.scalablytyped"
name := "xmldsigjs"
version := "2.0.22-2aa95c"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "asn1js" % "0.0-unknown-dt-20180910Z-570209",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181129Z-9f7a18",
  "com.scalablytyped" %%% "pkijs" % "0.0-unknown-dt-20180910Z-9cecfc",
  "com.scalablytyped" %%% "pvutils" % "0.0-unknown-dt-20180910Z-2bccb4",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "com.scalablytyped" %%% "tslib" % "1.9.3-9baf35",
  "com.scalablytyped" %%% "xml-core" % "1.0.15-e07a11",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        