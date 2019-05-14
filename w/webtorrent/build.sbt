organization := "org.scalablytyped"
name := "webtorrent"
version := "0.98-dt-20190212Z-b16c6b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "bittorrent-protocol" % "2.2-dt-20190212Z-b871c2",
  "org.scalablytyped" %%% "magnet-uri" % "5.1-dt-20190212Z-e41615",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190513Z-e9c6e7",
  "org.scalablytyped" %%% "parse-torrent" % "5.8-dt-20190212Z-a35f71",
  "org.scalablytyped" %%% "parse-torrent-file" % "4.0-dt-20190212Z-723f48",
  "org.scalablytyped" %%% "simple-peer" % "6.1-dt-20180721Z-c661e8",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        