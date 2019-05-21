organization := "org.scalablytyped"
name := "webtorrent"
version := "0.98-dt-20190212Z-d7c8f9"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "bittorrent-protocol" % "2.2-dt-20190212Z-6dc172",
  "org.scalablytyped" %%% "magnet-uri" % "5.1-dt-20190212Z-d31eb0",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190517Z-07594f",
  "org.scalablytyped" %%% "parse-torrent" % "5.8-dt-20190212Z-be7af7",
  "org.scalablytyped" %%% "parse-torrent-file" % "4.0-dt-20190212Z-b50e58",
  "org.scalablytyped" %%% "simple-peer" % "6.1-dt-20180721Z-ed9426",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        