organization := "org.scalablytyped"
name := "webtorrent"
version := "0.107-dt-20191210Z-f100fc"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bittorrent-protocol" % "2.2-dt-20190924Z-5e327c",
  "org.scalablytyped" %%% "magnet-uri" % "5.1-dt-20190212Z-4312f9",
  "org.scalablytyped" %%% "node" % "13.7-dt-20200211Z-d6af7e",
  "org.scalablytyped" %%% "parse-torrent" % "5.8-dt-20190212Z-d96d92",
  "org.scalablytyped" %%% "parse-torrent-file" % "4.0-dt-20190212Z-93cdd5",
  "org.scalablytyped" %%% "simple-peer" % "9.6-dt-20191114Z-da20a2",
  "org.scalablytyped" %%% "std" % "3.7-1b8369")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
