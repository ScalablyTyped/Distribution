organization := "org.scalablytyped"
name := "webtorrent"
version := "0.98-dt-20190212Z-e97f1f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "bittorrent-protocol" % "2.2-dt-20190212Z-618fd9",
  "org.scalablytyped" %%% "magnet-uri" % "5.1-dt-20190212Z-55635e",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190611Z-b8909f",
  "org.scalablytyped" %%% "parse-torrent" % "5.8-dt-20190212Z-645b31",
  "org.scalablytyped" %%% "parse-torrent-file" % "4.0-dt-20190212Z-364739",
  "org.scalablytyped" %%% "simple-peer" % "6.1-dt-20180721Z-b1b178",
  "org.scalablytyped" %%% "std" % "3.5-d4a303")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        