organization := "org.scalablytyped"
name := "xadesjs"
version := "2.0.13-dc66e5"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "asn1js" % "0.0-unknown-dt-20180910Z-263e2e",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-d9c01e",
  "org.scalablytyped" %%% "pkijs" % "0.0-unknown-dt-20180910Z-893628",
  "org.scalablytyped" %%% "pvutils" % "0.0-unknown-dt-20180910Z-7cbee9",
  "org.scalablytyped" %%% "std" % "3.2.1-edfe2b",
  "org.scalablytyped" %%% "tslib" % "1.9.3-6146fe",
  "org.scalablytyped" %%% "xml-core" % "1.0.15-d622e6",
  "org.scalablytyped" %%% "xmldsigjs" % "2.0.22-77660b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        