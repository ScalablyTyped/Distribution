organization := "org.scalablytyped"
name := "webtorrent"
version := "0.98-dt-20190212Z-5519a9"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bittorrent-protocol" % "2.2-dt-20190212Z-dbdf24",
  "org.scalablytyped" %%% "magnet-uri" % "5.1-dt-20190212Z-86a213",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190312Z-f6d9fe",
  "org.scalablytyped" %%% "parse-torrent" % "5.8-dt-20190212Z-1eeaae",
  "org.scalablytyped" %%% "parse-torrent-file" % "4.0-dt-20190212Z-5b2ec4",
  "org.scalablytyped" %%% "simple-peer" % "6.1-dt-20180721Z-f35745",
  "org.scalablytyped" %%% "std" % "3.3-ec2942")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        