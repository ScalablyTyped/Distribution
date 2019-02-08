organization := "org.scalablytyped"
name := "webtorrent"
version := "0.98-dt-20180807Z-b00a99"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bittorrent-protocol" % "2.2-dt-20180214Z-407e42",
  "org.scalablytyped" %%% "magnet-uri" % "5.1-dt-20180214Z-bc2bed",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190206Z-9f73ab",
  "org.scalablytyped" %%% "parse-torrent" % "5.8-dt-20180214Z-2ddb2f",
  "org.scalablytyped" %%% "parse-torrent-file" % "4.0-dt-20180214Z-345461",
  "org.scalablytyped" %%% "simple-peer" % "6.1-dt-20180721Z-7a0461",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        