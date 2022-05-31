organization := "org.scalablytyped"
name := "webtorrent"
version := "0.109-dt-20201023Z-652d77"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bittorrent-protocol" % "3.1-dt-20200728Z-4dd03f",
  "org.scalablytyped" %%% "magnet-uri" % "5.1-dt-20200515Z-65b0ff",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-11c649",
  "org.scalablytyped" %%% "parse-torrent" % "5.8-dt-20200226Z-c1fd1c",
  "org.scalablytyped" %%% "parse-torrent-file" % "4.0-dt-20200515Z-5cc291",
  "org.scalablytyped" %%% "simple-peer" % "9.6-dt-20201016Z-e059cf",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
