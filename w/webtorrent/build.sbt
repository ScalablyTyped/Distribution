organization := "org.scalablytyped"
name := "webtorrent"
version := "0.98-dt-20180807Z-0cfd40"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bittorrent-protocol" % "2.2-dt-20180214Z-90643a",
  "org.scalablytyped" %%% "magnet-uri" % "5.1-dt-20180214Z-99ee67",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2be335",
  "org.scalablytyped" %%% "parse-torrent" % "5.8-dt-20180214Z-22c204",
  "org.scalablytyped" %%% "parse-torrent-file" % "4.0-dt-20180214Z-a503ed",
  "org.scalablytyped" %%% "simple-peer" % "6.1-dt-20180721Z-792254",
  "org.scalablytyped" %%% "std" % "3.2.2-2926f1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        