organization := "org.scalablytyped"
name := "webtorrent"
version := "0.109-dt-20201023Z-297f99"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bittorrent-protocol" % "3.1-dt-20200728Z-112af7",
  "org.scalablytyped" %%% "magnet-uri" % "5.1-dt-20200515Z-f17ccc",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-e00132",
  "org.scalablytyped" %%% "parse-torrent" % "5.8-dt-20200226Z-47610f",
  "org.scalablytyped" %%% "parse-torrent-file" % "4.0-dt-20200515Z-5abd01",
  "org.scalablytyped" %%% "simple-peer" % "9.6-dt-20201016Z-60f8c1",
  "org.scalablytyped" %%% "std" % "4.1-2f6855")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
