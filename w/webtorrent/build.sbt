organization := "org.scalablytyped"
name := "webtorrent"
version := "0.107-dt-20191210Z-9b17c4"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bittorrent-protocol" % "2.2-dt-20190924Z-96bf76",
  "org.scalablytyped" %%% "magnet-uri" % "5.1-dt-20190212Z-6a6a8a",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200115Z-14f523",
  "org.scalablytyped" %%% "parse-torrent" % "5.8-dt-20190212Z-45faef",
  "org.scalablytyped" %%% "parse-torrent-file" % "4.0-dt-20190212Z-e3d456",
  "org.scalablytyped" %%% "simple-peer" % "9.6-dt-20191114Z-757d04",
  "org.scalablytyped" %%% "std" % "3.7-b6d959")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        