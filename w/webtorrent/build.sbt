organization := "org.scalablytyped"
name := "webtorrent"
version := "0.107-dt-20190816Z-1e9a14"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bittorrent-protocol" % "2.2-dt-20190924Z-95c855",
  "org.scalablytyped" %%% "magnet-uri" % "5.1-dt-20190212Z-bfd525",
  "org.scalablytyped" %%% "node" % "12.11-dt-20191023Z-ebe9d8",
  "org.scalablytyped" %%% "parse-torrent" % "5.8-dt-20190212Z-3a9835",
  "org.scalablytyped" %%% "parse-torrent-file" % "4.0-dt-20190212Z-5aa034",
  "org.scalablytyped" %%% "simple-peer" % "6.1-dt-20190626Z-60946d",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        