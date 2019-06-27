organization := "org.scalablytyped"
name := "webtorrent"
version := "0.98-dt-20190212Z-b8c8cb"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "bittorrent-protocol" % "2.2-dt-20190212Z-fd224c",
  "org.scalablytyped" %%% "magnet-uri" % "5.1-dt-20190212Z-89c8b7",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190621Z-8f9d23",
  "org.scalablytyped" %%% "parse-torrent" % "5.8-dt-20190212Z-12e39c",
  "org.scalablytyped" %%% "parse-torrent-file" % "4.0-dt-20190212Z-2be222",
  "org.scalablytyped" %%% "simple-peer" % "6.1-dt-20190626Z-a2cd4c",
  "org.scalablytyped" %%% "std" % "3.5-d4a303")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        