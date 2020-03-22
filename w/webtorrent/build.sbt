organization := "org.scalablytyped"
name := "webtorrent"
version := "0.107-dt-20191210Z-9af4a9"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bittorrent-protocol" % "2.2-dt-20190924Z-f06bdb",
  "org.scalablytyped" %%% "magnet-uri" % "5.1-dt-20190212Z-db2922",
  "org.scalablytyped" %%% "node" % "13.7-dt-20200211Z-b30bde",
  "org.scalablytyped" %%% "parse-torrent" % "5.8-dt-20190212Z-06b9d6",
  "org.scalablytyped" %%% "parse-torrent-file" % "4.0-dt-20190212Z-c2dfa3",
  "org.scalablytyped" %%% "simple-peer" % "9.6-dt-20191114Z-b32ee1",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
