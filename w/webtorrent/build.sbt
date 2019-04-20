organization := "org.scalablytyped"
name := "webtorrent"
version := "0.98-dt-20190212Z-5a3993"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "bittorrent-protocol" % "2.2-dt-20190212Z-9f5b69",
  "org.scalablytyped" %%% "magnet-uri" % "5.1-dt-20190212Z-0a3a2a",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190419Z-3f0246",
  "org.scalablytyped" %%% "parse-torrent" % "5.8-dt-20190212Z-83186c",
  "org.scalablytyped" %%% "parse-torrent-file" % "4.0-dt-20190212Z-cdd780",
  "org.scalablytyped" %%% "simple-peer" % "6.1-dt-20180721Z-01dbfd",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        