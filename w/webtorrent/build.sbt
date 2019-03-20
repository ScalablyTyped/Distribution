organization := "org.scalablytyped"
name := "webtorrent"
version := "0.98-dt-20190212Z-9afcbd"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bittorrent-protocol" % "2.2-dt-20190212Z-c664ef",
  "org.scalablytyped" %%% "magnet-uri" % "5.1-dt-20190212Z-f58cd5",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190319Z-4635bc",
  "org.scalablytyped" %%% "parse-torrent" % "5.8-dt-20190212Z-c367f4",
  "org.scalablytyped" %%% "parse-torrent-file" % "4.0-dt-20190212Z-cbe1cd",
  "org.scalablytyped" %%% "simple-peer" % "6.1-dt-20180721Z-9f8f3b",
  "org.scalablytyped" %%% "std" % "3.3-ec2942")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        