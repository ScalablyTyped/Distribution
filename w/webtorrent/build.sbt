organization := "org.scalablytyped"
name := "webtorrent"
version := "0.98-dt-20190212Z-d9c578"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bittorrent-protocol" % "2.2-dt-20190212Z-b88448",
  "org.scalablytyped" %%% "magnet-uri" % "5.1-dt-20190212Z-c99aa3",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-99335f",
  "org.scalablytyped" %%% "parse-torrent" % "5.8-dt-20190212Z-e61fe9",
  "org.scalablytyped" %%% "parse-torrent-file" % "4.0-dt-20190212Z-9324fb",
  "org.scalablytyped" %%% "simple-peer" % "6.1-dt-20180721Z-bbba40",
  "org.scalablytyped" %%% "std" % "3.3-6e4388")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        