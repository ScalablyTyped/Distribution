organization := "org.scalablytyped"
name := "webtorrent"
version := "0.98-dt-20190212Z-5af9f4"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bittorrent-protocol" % "2.2-dt-20190212Z-bc3e19",
  "org.scalablytyped" %%% "magnet-uri" % "5.1-dt-20190212Z-54b7ff",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190330Z-7c1cfd",
  "org.scalablytyped" %%% "parse-torrent" % "5.8-dt-20190212Z-8183a8",
  "org.scalablytyped" %%% "parse-torrent-file" % "4.0-dt-20190212Z-58d3ee",
  "org.scalablytyped" %%% "simple-peer" % "6.1-dt-20180721Z-1cc31b",
  "org.scalablytyped" %%% "std" % "3.4-d52857")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        