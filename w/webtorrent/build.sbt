organization := "org.scalablytyped"
name := "webtorrent"
version := "0.107-dt-20190816Z-f4a470"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bittorrent-protocol" % "2.2-dt-20190924Z-78d268",
  "org.scalablytyped" %%% "magnet-uri" % "5.1-dt-20190212Z-d010be",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191115Z-3b62fb",
  "org.scalablytyped" %%% "parse-torrent" % "5.8-dt-20190212Z-7f23f0",
  "org.scalablytyped" %%% "parse-torrent-file" % "4.0-dt-20190212Z-f483c3",
  "org.scalablytyped" %%% "simple-peer" % "9.6-dt-20191114Z-2a7c61",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        