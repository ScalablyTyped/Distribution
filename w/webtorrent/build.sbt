organization := "org.scalablytyped"
name := "webtorrent"
version := "0.98-dt-20190212Z-f2eb00"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bittorrent-protocol" % "2.2-dt-20190212Z-66aaa6",
  "org.scalablytyped" %%% "magnet-uri" % "5.1-dt-20190212Z-546b25",
  "org.scalablytyped" %%% "node" % "12.6-dt-20190717Z-f93e3e",
  "org.scalablytyped" %%% "parse-torrent" % "5.8-dt-20190212Z-2e6f92",
  "org.scalablytyped" %%% "parse-torrent-file" % "4.0-dt-20190212Z-d8a76d",
  "org.scalablytyped" %%% "simple-peer" % "6.1-dt-20190626Z-915fd3",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        