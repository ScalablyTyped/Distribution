organization := "org.scalablytyped"
name := "webtorrent"
version := "0.98-dt-20190212Z-4ee5fa"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "bittorrent-protocol" % "2.2-dt-20190212Z-bf0e8f",
  "org.scalablytyped" %%% "magnet-uri" % "5.1-dt-20190212Z-c155aa",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190502Z-d681c7",
  "org.scalablytyped" %%% "parse-torrent" % "5.8-dt-20190212Z-924694",
  "org.scalablytyped" %%% "parse-torrent-file" % "4.0-dt-20190212Z-3343b4",
  "org.scalablytyped" %%% "simple-peer" % "6.1-dt-20180721Z-2444a7",
  "org.scalablytyped" %%% "std" % "3.4-495f93")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        