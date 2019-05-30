organization := "org.scalablytyped"
name := "webtorrent"
version := "0.98-dt-20190212Z-fb7d25"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "bittorrent-protocol" % "2.2-dt-20190212Z-ebbf0a",
  "org.scalablytyped" %%% "magnet-uri" % "5.1-dt-20190212Z-cc884a",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190528Z-2c614a",
  "org.scalablytyped" %%% "parse-torrent" % "5.8-dt-20190212Z-ac974a",
  "org.scalablytyped" %%% "parse-torrent-file" % "4.0-dt-20190212Z-08dc4d",
  "org.scalablytyped" %%% "simple-peer" % "6.1-dt-20180721Z-c41060",
  "org.scalablytyped" %%% "std" % "3.5-f010ac")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        