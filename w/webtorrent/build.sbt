organization := "org.scalablytyped"
name := "webtorrent"
version := "0.98-dt-20190212Z-216315"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "bittorrent-protocol" % "2.2-dt-20190212Z-d4acac",
  "org.scalablytyped" %%% "magnet-uri" % "5.1-dt-20190212Z-47800b",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190611Z-76ef23",
  "org.scalablytyped" %%% "parse-torrent" % "5.8-dt-20190212Z-78a495",
  "org.scalablytyped" %%% "parse-torrent-file" % "4.0-dt-20190212Z-5291cf",
  "org.scalablytyped" %%% "simple-peer" % "6.1-dt-20180721Z-72c02c",
  "org.scalablytyped" %%% "std" % "3.5-c5d119")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        