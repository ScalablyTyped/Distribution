organization := "org.scalablytyped"
name := "webtorrent"
version := "0.107-dt-20190816Z-93f61a"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bittorrent-protocol" % "2.2-dt-20190924Z-1bb760",
  "org.scalablytyped" %%% "magnet-uri" % "5.1-dt-20190212Z-43adba",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191125Z-959704",
  "org.scalablytyped" %%% "parse-torrent" % "5.8-dt-20190212Z-d97eb0",
  "org.scalablytyped" %%% "parse-torrent-file" % "4.0-dt-20190212Z-9069ab",
  "org.scalablytyped" %%% "simple-peer" % "9.6-dt-20191114Z-dcfe2b",
  "org.scalablytyped" %%% "std" % "3.7-1d724d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        