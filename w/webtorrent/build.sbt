organization := "org.scalablytyped"
name := "webtorrent"
version := "0.98-dt-20180807Z-4df6e1"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bittorrent-protocol" % "2.2-dt-20180214Z-66ae8b",
  "org.scalablytyped" %%% "magnet-uri" % "5.1-dt-20180214Z-6338c6",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-40209e",
  "org.scalablytyped" %%% "parse-torrent" % "5.8-dt-20180214Z-4396af",
  "org.scalablytyped" %%% "parse-torrent-file" % "4.0-dt-20180214Z-5e5b2d",
  "org.scalablytyped" %%% "simple-peer" % "6.1-dt-20180721Z-b70a8c",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        