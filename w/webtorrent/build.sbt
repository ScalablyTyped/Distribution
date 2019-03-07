organization := "org.scalablytyped"
name := "webtorrent"
version := "0.98-dt-20190212Z-ffccca"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bittorrent-protocol" % "2.2-dt-20190212Z-3633b1",
  "org.scalablytyped" %%% "magnet-uri" % "5.1-dt-20190212Z-8dc306",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190302Z-6be09d",
  "org.scalablytyped" %%% "parse-torrent" % "5.8-dt-20190212Z-80a492",
  "org.scalablytyped" %%% "parse-torrent-file" % "4.0-dt-20190212Z-7508d7",
  "org.scalablytyped" %%% "simple-peer" % "6.1-dt-20180721Z-4cde69",
  "org.scalablytyped" %%% "std" % "3.3-05be79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        