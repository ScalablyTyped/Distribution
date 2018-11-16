organization := "com.scalablytyped"
name := "xadesjs"
version := "2.0.13-d6fe6b"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "asn1js" % "0.0-unknown-dt-20181102Z-45dded",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181116Z-806eaf",
  "com.scalablytyped" %%% "pkijs" % "0.0-unknown-dt-20181102Z-1dde20",
  "com.scalablytyped" %%% "pvutils" % "0.0-unknown-dt-20181102Z-59edac",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "com.scalablytyped" %%% "tslib" % "1.9.3-89a8f4",
  "com.scalablytyped" %%% "xml-core" % "1.0.15-63c762",
  "com.scalablytyped" %%% "xmldsigjs" % "2.0.22-a17e6a",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        