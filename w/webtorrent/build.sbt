organization := "org.scalablytyped"
name := "webtorrent"
version := "0.107-dt-20190816Z-28e82d"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bittorrent-protocol" % "2.2-dt-20190212Z-eb7b38",
  "org.scalablytyped" %%% "magnet-uri" % "5.1-dt-20190212Z-3d69c7",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190820Z-2dc4df",
  "org.scalablytyped" %%% "parse-torrent" % "5.8-dt-20190212Z-4c0f1f",
  "org.scalablytyped" %%% "parse-torrent-file" % "4.0-dt-20190212Z-d01927",
  "org.scalablytyped" %%% "simple-peer" % "6.1-dt-20190626Z-0694f2",
  "org.scalablytyped" %%% "std" % "3.5-cd493c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        