organization := "org.scalablytyped"
name := "webtorrent"
version := "0.98-dt-20190212Z-b83c3b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "bittorrent-protocol" % "2.2-dt-20190212Z-9cf783",
  "org.scalablytyped" %%% "magnet-uri" % "5.1-dt-20190212Z-2764eb",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190503Z-cb8223",
  "org.scalablytyped" %%% "parse-torrent" % "5.8-dt-20190212Z-504965",
  "org.scalablytyped" %%% "parse-torrent-file" % "4.0-dt-20190212Z-060337",
  "org.scalablytyped" %%% "simple-peer" % "6.1-dt-20180721Z-328ebc",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        