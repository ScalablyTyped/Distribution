organization := "org.scalablytyped"
name := "webtorrent"
version := "0.109-dt-20201023Z-030bd3"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bittorrent-protocol" % "3.1-dt-20200728Z-3c5234",
  "org.scalablytyped" %%% "magnet-uri" % "5.1-dt-20200515Z-8805b2",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-814aa8",
  "org.scalablytyped" %%% "parse-torrent" % "5.8-dt-20200226Z-9dfb3b",
  "org.scalablytyped" %%% "parse-torrent-file" % "4.0-dt-20200515Z-72234c",
  "org.scalablytyped" %%% "simple-peer" % "9.6-dt-20201016Z-580105",
  "org.scalablytyped" %%% "std" % "4.1-044efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
