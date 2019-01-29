organization := "org.scalablytyped"
name := "webtorrent"
version := "0.98-dt-20180807Z-1ab232"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bittorrent-protocol" % "2.2-dt-20180214Z-29316b",
  "org.scalablytyped" %%% "magnet-uri" % "5.1-dt-20180214Z-836e7e",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190128Z-23a585",
  "org.scalablytyped" %%% "parse-torrent" % "5.8-dt-20180214Z-6a71f0",
  "org.scalablytyped" %%% "parse-torrent-file" % "4.0-dt-20180214Z-5ad3f3",
  "org.scalablytyped" %%% "simple-peer" % "6.1-dt-20180721Z-4bb61f",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        