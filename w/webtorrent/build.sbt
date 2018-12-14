organization := "org.scalablytyped"
name := "webtorrent"
version := "0.98-dt-20180910Z-14d750"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bittorrent-protocol" % "2.2-dt-20180910Z-9caf25",
  "org.scalablytyped" %%% "magnet-uri" % "5.1-dt-20180910Z-7db1cb",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181214Z-702cdc",
  "org.scalablytyped" %%% "parse-torrent" % "5.8-dt-20180910Z-6caa98",
  "org.scalablytyped" %%% "parse-torrent-file" % "4.0-dt-20180910Z-1b98a3",
  "org.scalablytyped" %%% "simple-peer" % "6.1-dt-20180910Z-d589bd",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        