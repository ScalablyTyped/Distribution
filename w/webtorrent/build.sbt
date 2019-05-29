organization := "org.scalablytyped"
name := "webtorrent"
version := "0.98-dt-20190212Z-69aa90"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "bittorrent-protocol" % "2.2-dt-20190212Z-9d1e78",
  "org.scalablytyped" %%% "magnet-uri" % "5.1-dt-20190212Z-537526",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190528Z-17198b",
  "org.scalablytyped" %%% "parse-torrent" % "5.8-dt-20190212Z-aa0a89",
  "org.scalablytyped" %%% "parse-torrent-file" % "4.0-dt-20190212Z-a8a65f",
  "org.scalablytyped" %%% "simple-peer" % "6.1-dt-20180721Z-6fa214",
  "org.scalablytyped" %%% "std" % "3.4-ef47bb")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        