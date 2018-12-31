organization := "org.scalablytyped"
name := "webtorrent"
version := "0.98-dt-20180807Z-274598"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bittorrent-protocol" % "2.2-dt-20180214Z-1fb236",
  "org.scalablytyped" %%% "magnet-uri" % "5.1-dt-20180214Z-3e8ce9",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-77ce7e",
  "org.scalablytyped" %%% "parse-torrent" % "5.8-dt-20180214Z-95fff2",
  "org.scalablytyped" %%% "parse-torrent-file" % "4.0-dt-20180214Z-46fd27",
  "org.scalablytyped" %%% "simple-peer" % "6.1-dt-20180721Z-d358ec",
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        