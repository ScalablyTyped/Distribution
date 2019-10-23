organization := "org.scalablytyped"
name := "webtorrent"
version := "0.107-dt-20190816Z-2af7f5"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bittorrent-protocol" % "2.2-dt-20190924Z-c93d2e",
  "org.scalablytyped" %%% "magnet-uri" % "5.1-dt-20190212Z-02bda0",
  "org.scalablytyped" %%% "node" % "12.11-dt-20191022Z-f18ffd",
  "org.scalablytyped" %%% "parse-torrent" % "5.8-dt-20190212Z-1cdf9c",
  "org.scalablytyped" %%% "parse-torrent-file" % "4.0-dt-20190212Z-d2007b",
  "org.scalablytyped" %%% "simple-peer" % "6.1-dt-20190626Z-ceb09b",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        