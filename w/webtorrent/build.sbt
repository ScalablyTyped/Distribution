organization := "org.scalablytyped"
name := "webtorrent"
version := "0.107-dt-20191210Z-76eed5"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bittorrent-protocol" % "2.2-dt-20190924Z-11b9da",
  "org.scalablytyped" %%% "magnet-uri" % "5.1-dt-20190212Z-13198e",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200117Z-4be21b",
  "org.scalablytyped" %%% "parse-torrent" % "5.8-dt-20190212Z-347f80",
  "org.scalablytyped" %%% "parse-torrent-file" % "4.0-dt-20190212Z-d35dbb",
  "org.scalablytyped" %%% "simple-peer" % "9.6-dt-20191114Z-c451d9",
  "org.scalablytyped" %%% "std" % "3.7-96076c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        