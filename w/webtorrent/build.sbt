organization := "org.scalablytyped"
name := "webtorrent"
version := "0.98-dt-20180807Z-e9a65c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bittorrent-protocol" % "2.2-dt-20180214Z-d67b1c",
  "org.scalablytyped" %%% "magnet-uri" % "5.1-dt-20180214Z-9aab0b",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-8da1df",
  "org.scalablytyped" %%% "parse-torrent" % "5.8-dt-20180214Z-05141a",
  "org.scalablytyped" %%% "parse-torrent-file" % "4.0-dt-20180214Z-4848b2",
  "org.scalablytyped" %%% "simple-peer" % "6.1-dt-20180721Z-7d35f3",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        