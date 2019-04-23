organization := "org.scalablytyped"
name := "webtorrent"
version := "0.98-dt-20190212Z-58ede4"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "bittorrent-protocol" % "2.2-dt-20190212Z-4e9245",
  "org.scalablytyped" %%% "magnet-uri" % "5.1-dt-20190212Z-459078",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190422Z-40afee",
  "org.scalablytyped" %%% "parse-torrent" % "5.8-dt-20190212Z-97c8cd",
  "org.scalablytyped" %%% "parse-torrent-file" % "4.0-dt-20190212Z-fab62f",
  "org.scalablytyped" %%% "simple-peer" % "6.1-dt-20180721Z-1cd832",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        