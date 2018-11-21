organization := "com.scalablytyped"
name := "webtorrent"
version := "0.98-dt-20180910Z-fd6dbc"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "bittorrent-protocol" % "2.2-dt-20180910Z-74a059",
  "com.scalablytyped" %%% "magnet-uri" % "5.1-dt-20180910Z-180bed",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181116Z-cadd20",
  "com.scalablytyped" %%% "parse-torrent" % "5.8-dt-20180910Z-78f330",
  "com.scalablytyped" %%% "parse-torrent-file" % "4.0-dt-20180910Z-2722fe",
  "com.scalablytyped" %%% "simple-peer" % "6.1-dt-20180910Z-bfcc1d",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        