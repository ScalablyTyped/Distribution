organization := "org.scalablytyped"
name := "xadesjs"
version := "2.0.14-1b1a91"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "asn1js" % "0.0-unknown-dt-20180214Z-7ca9fb",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-99335f",
  "org.scalablytyped" %%% "pkijs" % "0.0-unknown-dt-20190217Z-8efedd",
  "org.scalablytyped" %%% "pvutils" % "0.0-unknown-dt-20180214Z-b4aacb",
  "org.scalablytyped" %%% "std" % "3.3-6e4388",
  "org.scalablytyped" %%% "tslib" % "1.9.3-9355d3",
  "org.scalablytyped" %%% "xml-core" % "1.0.15-5bba5f",
  "org.scalablytyped" %%% "xmldsigjs" % "2.0.22-a66d6c")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        