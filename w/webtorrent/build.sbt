organization := "org.scalablytyped"
name := "webtorrent"
version := "0.98-dt-20190212Z-8d9be0"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bittorrent-protocol" % "2.2-dt-20190212Z-08e192",
  "org.scalablytyped" %%% "magnet-uri" % "5.1-dt-20190212Z-9ed7c2",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-bb7734",
  "org.scalablytyped" %%% "parse-torrent" % "5.8-dt-20190212Z-2deb90",
  "org.scalablytyped" %%% "parse-torrent-file" % "4.0-dt-20190212Z-33a10a",
  "org.scalablytyped" %%% "simple-peer" % "6.1-dt-20180721Z-d4ff76",
  "org.scalablytyped" %%% "std" % "3.3-6e4388")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        