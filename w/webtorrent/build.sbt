organization := "com.scalablytyped"
name := "webtorrent"
version := "0.98-dt-20181102Z-333ad4"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "bittorrent-protocol" % "2.2-dt-20181102Z-214195",
  "com.scalablytyped" %%% "magnet-uri" % "5.1-dt-20181102Z-32d38e",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181116Z-806eaf",
  "com.scalablytyped" %%% "parse-torrent" % "5.8-dt-20181102Z-4eb250",
  "com.scalablytyped" %%% "parse-torrent-file" % "4.0-dt-20181102Z-4eae74",
  "com.scalablytyped" %%% "simple-peer" % "6.1-dt-20181102Z-3001fc",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        