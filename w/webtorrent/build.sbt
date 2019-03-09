organization := "org.scalablytyped"
name := "webtorrent"
version := "0.98-dt-20190212Z-c667bb"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bittorrent-protocol" % "2.2-dt-20190212Z-2aab58",
  "org.scalablytyped" %%% "magnet-uri" % "5.1-dt-20190212Z-b68077",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190307Z-7720a8",
  "org.scalablytyped" %%% "parse-torrent" % "5.8-dt-20190212Z-d2dc26",
  "org.scalablytyped" %%% "parse-torrent-file" % "4.0-dt-20190212Z-cf3e9c",
  "org.scalablytyped" %%% "simple-peer" % "6.1-dt-20180721Z-54c2dc",
  "org.scalablytyped" %%% "std" % "3.3-05be79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        