organization := "org.scalablytyped"
name := "webtorrent"
version := "0.98-dt-20190212Z-661a1d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "bittorrent-protocol" % "2.2-dt-20190212Z-984235",
  "org.scalablytyped" %%% "magnet-uri" % "5.1-dt-20190212Z-f31e63",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190429Z-40b461",
  "org.scalablytyped" %%% "parse-torrent" % "5.8-dt-20190212Z-d8228e",
  "org.scalablytyped" %%% "parse-torrent-file" % "4.0-dt-20190212Z-e6e8cd",
  "org.scalablytyped" %%% "simple-peer" % "6.1-dt-20180721Z-ff5e1f",
  "org.scalablytyped" %%% "std" % "3.4-495f93")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        