organization := "org.scalablytyped"
name := "webtorrent"
version := "0.98-dt-20190212Z-0f8d1e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "bittorrent-protocol" % "2.2-dt-20190212Z-f5341d",
  "org.scalablytyped" %%% "magnet-uri" % "5.1-dt-20190212Z-e37f23",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190703Z-0260d9",
  "org.scalablytyped" %%% "parse-torrent" % "5.8-dt-20190212Z-7e6c78",
  "org.scalablytyped" %%% "parse-torrent-file" % "4.0-dt-20190212Z-c529d0",
  "org.scalablytyped" %%% "simple-peer" % "6.1-dt-20190626Z-732458",
  "org.scalablytyped" %%% "std" % "3.5-d4a303")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        