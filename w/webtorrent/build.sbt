organization := "org.scalablytyped"
name := "webtorrent"
version := "0.98-dt-20190212Z-9225b0"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "bittorrent-protocol" % "2.2-dt-20190212Z-0f5e42",
  "org.scalablytyped" %%% "magnet-uri" % "5.1-dt-20190212Z-95ea22",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190502Z-84ec9f",
  "org.scalablytyped" %%% "parse-torrent" % "5.8-dt-20190212Z-0577bf",
  "org.scalablytyped" %%% "parse-torrent-file" % "4.0-dt-20190212Z-7d7f3e",
  "org.scalablytyped" %%% "simple-peer" % "6.1-dt-20180721Z-389a8c",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        