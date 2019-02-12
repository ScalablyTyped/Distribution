organization := "org.scalablytyped"
name := "webtorrent"
version := "0.98-dt-20180807Z-0a8dfb"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bittorrent-protocol" % "2.2-dt-20180214Z-3e0d9f",
  "org.scalablytyped" %%% "magnet-uri" % "5.1-dt-20180214Z-1e3133",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190211Z-6a64f2",
  "org.scalablytyped" %%% "parse-torrent" % "5.8-dt-20180214Z-e154ed",
  "org.scalablytyped" %%% "parse-torrent-file" % "4.0-dt-20180214Z-aa0c96",
  "org.scalablytyped" %%% "simple-peer" % "6.1-dt-20180721Z-c5718f",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        