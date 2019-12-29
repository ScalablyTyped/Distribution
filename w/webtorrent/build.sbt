organization := "org.scalablytyped"
name := "webtorrent"
version := "0.107-dt-20191210Z-19b6e6"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bittorrent-protocol" % "2.2-dt-20190924Z-4b7a51",
  "org.scalablytyped" %%% "magnet-uri" % "5.1-dt-20190212Z-a97a85",
  "org.scalablytyped" %%% "node" % "13.1-dt-20191226Z-155d58",
  "org.scalablytyped" %%% "parse-torrent" % "5.8-dt-20190212Z-c717d8",
  "org.scalablytyped" %%% "parse-torrent-file" % "4.0-dt-20190212Z-1930e9",
  "org.scalablytyped" %%% "simple-peer" % "9.6-dt-20191114Z-2d8caa",
  "org.scalablytyped" %%% "std" % "3.7-953338")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        