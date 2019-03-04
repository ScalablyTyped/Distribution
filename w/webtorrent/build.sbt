organization := "org.scalablytyped"
name := "webtorrent"
version := "0.98-dt-20190212Z-db1e62"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bittorrent-protocol" % "2.2-dt-20190212Z-4b627a",
  "org.scalablytyped" %%% "magnet-uri" % "5.1-dt-20190212Z-d0e5bf",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-fd0a52",
  "org.scalablytyped" %%% "parse-torrent" % "5.8-dt-20190212Z-3cf270",
  "org.scalablytyped" %%% "parse-torrent-file" % "4.0-dt-20190212Z-ea575e",
  "org.scalablytyped" %%% "simple-peer" % "6.1-dt-20180721Z-058a57",
  "org.scalablytyped" %%% "std" % "3.3-05be79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        