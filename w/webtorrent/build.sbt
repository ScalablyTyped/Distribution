organization := "org.scalablytyped"
name := "webtorrent"
version := "0.98-dt-20190212Z-07002f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bittorrent-protocol" % "2.2-dt-20190212Z-f35317",
  "org.scalablytyped" %%% "magnet-uri" % "5.1-dt-20190212Z-da0caf",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190212Z-0d969a",
  "org.scalablytyped" %%% "parse-torrent" % "5.8-dt-20190212Z-d28154",
  "org.scalablytyped" %%% "parse-torrent-file" % "4.0-dt-20190212Z-a3bbcb",
  "org.scalablytyped" %%% "simple-peer" % "6.1-dt-20180721Z-57d6c5",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        