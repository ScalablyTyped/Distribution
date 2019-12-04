organization := "org.scalablytyped"
name := "webtorrent"
version := "0.107-dt-20190816Z-92c72c"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bittorrent-protocol" % "2.2-dt-20190924Z-2bb413",
  "org.scalablytyped" %%% "magnet-uri" % "5.1-dt-20190212Z-1c12c6",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191126Z-959704",
  "org.scalablytyped" %%% "parse-torrent" % "5.8-dt-20190212Z-3b79a2",
  "org.scalablytyped" %%% "parse-torrent-file" % "4.0-dt-20190212Z-ffdc02",
  "org.scalablytyped" %%% "simple-peer" % "9.6-dt-20191114Z-1499e5",
  "org.scalablytyped" %%% "std" % "3.7-1d724d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        