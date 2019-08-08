organization := "org.scalablytyped"
name := "webtorrent"
version := "0.98-dt-20190212Z-1c2904"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bittorrent-protocol" % "2.2-dt-20190212Z-b41c89",
  "org.scalablytyped" %%% "magnet-uri" % "5.1-dt-20190212Z-d6a90b",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190807Z-ed4b3f",
  "org.scalablytyped" %%% "parse-torrent" % "5.8-dt-20190212Z-39a732",
  "org.scalablytyped" %%% "parse-torrent-file" % "4.0-dt-20190212Z-eab5a9",
  "org.scalablytyped" %%% "simple-peer" % "6.1-dt-20190626Z-cd2747",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        