organization := "org.scalablytyped"
name := "webtorrent"
version := "0.107-dt-20200515Z-b2baca"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bittorrent-protocol" % "3.1-dt-20200515Z-03c77c",
  "org.scalablytyped" %%% "magnet-uri" % "5.1-dt-20200515Z-d04244",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200724Z-6c1ba3",
  "org.scalablytyped" %%% "parse-torrent" % "5.8-dt-20200226Z-fdcf3e",
  "org.scalablytyped" %%% "parse-torrent-file" % "4.0-dt-20200515Z-6105a9",
  "org.scalablytyped" %%% "simple-peer" % "9.6-dt-20200515Z-6c0401",
  "org.scalablytyped" %%% "std" % "3.9-bafc13")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
