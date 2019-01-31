organization := "org.scalablytyped"
name := "xadesjs"
version := "2.0.14-b58512"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "asn1js" % "0.0-unknown-dt-20180214Z-cc9372",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-92720c",
  "org.scalablytyped" %%% "pkijs" % "0.0-unknown-dt-20180214Z-008b9b",
  "org.scalablytyped" %%% "pvutils" % "0.0-unknown-dt-20180214Z-4bebf8",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314",
  "org.scalablytyped" %%% "tslib" % "1.9.3-856848",
  "org.scalablytyped" %%% "xml-core" % "1.0.15-26cca3",
  "org.scalablytyped" %%% "xmldsigjs" % "2.0.22-abb109")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        