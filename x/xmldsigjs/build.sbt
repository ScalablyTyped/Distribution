organization := "org.scalablytyped"
name := "xmldsigjs"
version := "2.0.22-f245cb"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "asn1js" % "0.0-unknown-dt-20190322Z-8a0704",
  "org.scalablytyped" %%% "node" % "11.12-dt-20190330Z-e2b8de",
  "org.scalablytyped" %%% "pkijs" % "0.0-unknown-dt-20190322Z-b9d41a",
  "org.scalablytyped" %%% "pvutils" % "0.0-unknown-dt-20190322Z-59c240",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "tslib" % "1.9.3-446b32",
  "org.scalablytyped" %%% "xml-core" % "1.0.15-f6cf8e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        