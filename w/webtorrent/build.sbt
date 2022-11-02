organization := "org.scalablytyped"
name := "webtorrent"
version := "0.109-dt-20220103Z-441d9d"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bittorrent-protocol" % "3.1-dt-20220101Z-f5b1b3",
  "org.scalablytyped" %%% "magnet-uri" % "5.1-dt-20211202Z-c08545",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-d0f137",
  "org.scalablytyped" %%% "parse-torrent" % "5.8-dt-20211202Z-706748",
  "org.scalablytyped" %%% "parse-torrent-file" % "4.0-dt-20211202Z-d58a24",
  "org.scalablytyped" %%% "simple-peer" % "9.11-dt-20220810Z-595182",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
