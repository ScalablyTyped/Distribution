organization := "org.scalablytyped"
name := "webtorrent"
version := "0.107-dt-20191210Z-36f7e5"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bittorrent-protocol" % "2.2-dt-20190924Z-0d50bf",
  "org.scalablytyped" %%% "magnet-uri" % "5.1-dt-20190212Z-dcec7c",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200103Z-51871a",
  "org.scalablytyped" %%% "parse-torrent" % "5.8-dt-20190212Z-58f008",
  "org.scalablytyped" %%% "parse-torrent-file" % "4.0-dt-20190212Z-f97683",
  "org.scalablytyped" %%% "simple-peer" % "9.6-dt-20191114Z-61cd03",
  "org.scalablytyped" %%% "std" % "3.7-b6d959")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        