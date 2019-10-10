organization := "org.scalablytyped"
name := "webtorrent"
version := "0.107-dt-20190816Z-bb0924"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bittorrent-protocol" % "2.2-dt-20190924Z-ea57e0",
  "org.scalablytyped" %%% "magnet-uri" % "5.1-dt-20190212Z-0c44e5",
  "org.scalablytyped" %%% "node" % "12.7-dt-20191008Z-8637fd",
  "org.scalablytyped" %%% "parse-torrent" % "5.8-dt-20190212Z-3d4783",
  "org.scalablytyped" %%% "parse-torrent-file" % "4.0-dt-20190212Z-cf6ea8",
  "org.scalablytyped" %%% "simple-peer" % "6.1-dt-20190626Z-8d2a0c",
  "org.scalablytyped" %%% "std" % "3.6-abb6d3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        