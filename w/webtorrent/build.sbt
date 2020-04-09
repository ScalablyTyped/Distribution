organization := "org.scalablytyped"
name := "webtorrent"
version := "0.107-dt-20200401Z-96f3e2"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bittorrent-protocol" % "2.2-dt-20200225Z-d2736b",
  "org.scalablytyped" %%% "magnet-uri" % "5.1-dt-20190212Z-16e991",
  "org.scalablytyped" %%% "node" % "13.11-dt-20200402Z-9a87f0",
  "org.scalablytyped" %%% "parse-torrent" % "5.8-dt-20200226Z-2ff626",
  "org.scalablytyped" %%% "parse-torrent-file" % "4.0-dt-20190212Z-8a08ff",
  "org.scalablytyped" %%% "simple-peer" % "9.6-dt-20191114Z-c98c4c",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
