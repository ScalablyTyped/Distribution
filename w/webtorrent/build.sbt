organization := "org.scalablytyped"
name := "webtorrent"
version := "0.107-dt-20190816Z-456939"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bittorrent-protocol" % "2.2-dt-20190212Z-31b98c",
  "org.scalablytyped" %%% "magnet-uri" % "5.1-dt-20190212Z-673022",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190903Z-da4655",
  "org.scalablytyped" %%% "parse-torrent" % "5.8-dt-20190212Z-a816f8",
  "org.scalablytyped" %%% "parse-torrent-file" % "4.0-dt-20190212Z-31fed3",
  "org.scalablytyped" %%% "simple-peer" % "6.1-dt-20190626Z-b70548",
  "org.scalablytyped" %%% "std" % "3.6-c16502")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        