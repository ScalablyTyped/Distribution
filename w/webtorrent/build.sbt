organization := "org.scalablytyped"
name := "webtorrent"
version := "0.98-dt-20190212Z-f09cda"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "bittorrent-protocol" % "2.2-dt-20190212Z-1a7db2",
  "org.scalablytyped" %%% "magnet-uri" % "5.1-dt-20190212Z-40403a",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190514Z-07594f",
  "org.scalablytyped" %%% "parse-torrent" % "5.8-dt-20190212Z-3ecb11",
  "org.scalablytyped" %%% "parse-torrent-file" % "4.0-dt-20190212Z-0a63db",
  "org.scalablytyped" %%% "simple-peer" % "6.1-dt-20180721Z-c75e00",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        