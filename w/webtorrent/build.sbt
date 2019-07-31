organization := "org.scalablytyped"
name := "webtorrent"
version := "0.98-dt-20190212Z-143819"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bittorrent-protocol" % "2.2-dt-20190212Z-ed3bb3",
  "org.scalablytyped" %%% "magnet-uri" % "5.1-dt-20190212Z-1a8ae8",
  "org.scalablytyped" %%% "node" % "12.6-dt-20190731Z-f93e3e",
  "org.scalablytyped" %%% "parse-torrent" % "5.8-dt-20190212Z-b993b6",
  "org.scalablytyped" %%% "parse-torrent-file" % "4.0-dt-20190212Z-1de4b5",
  "org.scalablytyped" %%% "simple-peer" % "6.1-dt-20190626Z-1fab1f",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        