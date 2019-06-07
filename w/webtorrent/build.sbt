organization := "org.scalablytyped"
name := "webtorrent"
version := "0.98-dt-20190212Z-d47397"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "bittorrent-protocol" % "2.2-dt-20190212Z-5bb294",
  "org.scalablytyped" %%% "magnet-uri" % "5.1-dt-20190212Z-80c09f",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190606Z-b7fe68",
  "org.scalablytyped" %%% "parse-torrent" % "5.8-dt-20190212Z-5029fd",
  "org.scalablytyped" %%% "parse-torrent-file" % "4.0-dt-20190212Z-f85019",
  "org.scalablytyped" %%% "simple-peer" % "6.1-dt-20180721Z-5197be",
  "org.scalablytyped" %%% "std" % "3.5-f010ac")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        