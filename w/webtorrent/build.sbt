organization := "org.scalablytyped"
name := "webtorrent"
version := "0.107-dt-20190816Z-c07493"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bittorrent-protocol" % "2.2-dt-20190924Z-dd169f",
  "org.scalablytyped" %%% "magnet-uri" % "5.1-dt-20190212Z-ac2ddf",
  "org.scalablytyped" %%% "node" % "12.11-dt-20191024Z-c10572",
  "org.scalablytyped" %%% "parse-torrent" % "5.8-dt-20190212Z-9bfa88",
  "org.scalablytyped" %%% "parse-torrent-file" % "4.0-dt-20190212Z-b3c578",
  "org.scalablytyped" %%% "simple-peer" % "6.1-dt-20190626Z-ae198b",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        