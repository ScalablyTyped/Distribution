organization := "org.scalablytyped"
name := "webtorrent"
version := "0.98-dt-20190212Z-b3eb79"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bittorrent-protocol" % "2.2-dt-20190212Z-861a66",
  "org.scalablytyped" %%% "magnet-uri" % "5.1-dt-20190212Z-af143b",
  "org.scalablytyped" %%% "node" % "11.12-dt-20190330Z-e2b8de",
  "org.scalablytyped" %%% "parse-torrent" % "5.8-dt-20190212Z-7dee60",
  "org.scalablytyped" %%% "parse-torrent-file" % "4.0-dt-20190212Z-3a95a7",
  "org.scalablytyped" %%% "simple-peer" % "6.1-dt-20180721Z-469e31",
  "org.scalablytyped" %%% "std" % "3.4-d52857")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        