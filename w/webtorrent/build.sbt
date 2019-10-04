organization := "org.scalablytyped"
name := "webtorrent"
version := "0.107-dt-20190816Z-701d9f"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bittorrent-protocol" % "2.2-dt-20190924Z-51ebde",
  "org.scalablytyped" %%% "magnet-uri" % "5.1-dt-20190212Z-59f769",
  "org.scalablytyped" %%% "node" % "12.7-dt-20191003Z-e91184",
  "org.scalablytyped" %%% "parse-torrent" % "5.8-dt-20190212Z-5d1da1",
  "org.scalablytyped" %%% "parse-torrent-file" % "4.0-dt-20190212Z-3a4244",
  "org.scalablytyped" %%% "simple-peer" % "6.1-dt-20190626Z-33b147",
  "org.scalablytyped" %%% "std" % "3.6-c16502")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        