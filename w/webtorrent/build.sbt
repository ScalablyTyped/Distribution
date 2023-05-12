organization := "org.scalablytyped"
name := "webtorrent"
version := "0.109-dt-20220103Z-e748c1"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bittorrent-protocol" % "3.1-dt-20221230Z-8f86a4",
  "org.scalablytyped" %%% "magnet-uri" % "5.1-dt-20211202Z-8c0d1c",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230511Z-0320fc",
  "org.scalablytyped" %%% "parse-torrent" % "5.8-dt-20211202Z-2c4d81",
  "org.scalablytyped" %%% "parse-torrent-file" % "4.0-dt-20211202Z-106239",
  "org.scalablytyped" %%% "simple-peer" % "9.11-dt-20220810Z-808b4b",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
