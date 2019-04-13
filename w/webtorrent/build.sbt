organization := "org.scalablytyped"
name := "webtorrent"
version := "0.98-dt-20190212Z-ea94fd"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "bittorrent-protocol" % "2.2-dt-20190212Z-a7bce4",
  "org.scalablytyped" %%% "magnet-uri" % "5.1-dt-20190212Z-2467c7",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190409Z-28d4e0",
  "org.scalablytyped" %%% "parse-torrent" % "5.8-dt-20190212Z-b5fe9b",
  "org.scalablytyped" %%% "parse-torrent-file" % "4.0-dt-20190212Z-e7f9c2",
  "org.scalablytyped" %%% "simple-peer" % "6.1-dt-20180721Z-09c5f7",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        