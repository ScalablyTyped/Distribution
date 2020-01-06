organization := "org.scalablytyped"
name := "webtorrent"
version := "0.107-dt-20191210Z-c1c8b4"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bittorrent-protocol" % "2.2-dt-20190924Z-16ea40",
  "org.scalablytyped" %%% "magnet-uri" % "5.1-dt-20190212Z-375df7",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200103Z-b9f880",
  "org.scalablytyped" %%% "parse-torrent" % "5.8-dt-20190212Z-68b865",
  "org.scalablytyped" %%% "parse-torrent-file" % "4.0-dt-20190212Z-f11afc",
  "org.scalablytyped" %%% "simple-peer" % "9.6-dt-20191114Z-e377e9",
  "org.scalablytyped" %%% "std" % "3.7-b6d959")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        