organization := "org.scalablytyped"
name := "webtorrent"
version := "0.98-dt-20190212Z-9d55c1"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bittorrent-protocol" % "2.2-dt-20190212Z-3a18e9",
  "org.scalablytyped" %%% "magnet-uri" % "5.1-dt-20190212Z-fdb704",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190325Z-000e7b",
  "org.scalablytyped" %%% "parse-torrent" % "5.8-dt-20190212Z-dac301",
  "org.scalablytyped" %%% "parse-torrent-file" % "4.0-dt-20190212Z-68f196",
  "org.scalablytyped" %%% "simple-peer" % "6.1-dt-20180721Z-5c6217",
  "org.scalablytyped" %%% "std" % "3.3-14e863")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        