organization := "org.scalablytyped"
name := "webtorrent"
version := "0.98-dt-20190212Z-d93315"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "bittorrent-protocol" % "2.2-dt-20190212Z-324ce9",
  "org.scalablytyped" %%% "magnet-uri" % "5.1-dt-20190212Z-5fd98b",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190517Z-1fb914",
  "org.scalablytyped" %%% "parse-torrent" % "5.8-dt-20190212Z-aae4ff",
  "org.scalablytyped" %%% "parse-torrent-file" % "4.0-dt-20190212Z-27510b",
  "org.scalablytyped" %%% "simple-peer" % "6.1-dt-20180721Z-41a6cc",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        