organization := "org.scalablytyped"
name := "webtorrent"
version := "0.107-dt-20190816Z-ce9b6e"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bittorrent-protocol" % "2.2-dt-20190924Z-32c823",
  "org.scalablytyped" %%% "magnet-uri" % "5.1-dt-20190212Z-d72c3d",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191123Z-382692",
  "org.scalablytyped" %%% "parse-torrent" % "5.8-dt-20190212Z-d3b34f",
  "org.scalablytyped" %%% "parse-torrent-file" % "4.0-dt-20190212Z-d6f711",
  "org.scalablytyped" %%% "simple-peer" % "9.6-dt-20191114Z-22e336",
  "org.scalablytyped" %%% "std" % "3.7-1d724d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        