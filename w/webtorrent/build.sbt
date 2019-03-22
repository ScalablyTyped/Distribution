organization := "org.scalablytyped"
name := "webtorrent"
version := "0.98-dt-20190212Z-b34732"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bittorrent-protocol" % "2.2-dt-20190212Z-c87446",
  "org.scalablytyped" %%% "magnet-uri" % "5.1-dt-20190212Z-fc81c4",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190320Z-26b6b7",
  "org.scalablytyped" %%% "parse-torrent" % "5.8-dt-20190212Z-63197b",
  "org.scalablytyped" %%% "parse-torrent-file" % "4.0-dt-20190212Z-8b04f7",
  "org.scalablytyped" %%% "simple-peer" % "6.1-dt-20180721Z-0af2f0",
  "org.scalablytyped" %%% "std" % "3.3-ec2942")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        