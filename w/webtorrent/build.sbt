organization := "org.scalablytyped"
name := "webtorrent"
version := "0.109-dt-20220103Z-b235bb"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bittorrent-protocol" % "3.1-dt-20220101Z-2775bd",
  "org.scalablytyped" %%% "magnet-uri" % "5.1-dt-20211202Z-b9c440",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221020Z-d73de4",
  "org.scalablytyped" %%% "parse-torrent" % "5.8-dt-20211202Z-cf7ce7",
  "org.scalablytyped" %%% "parse-torrent-file" % "4.0-dt-20211202Z-9c7389",
  "org.scalablytyped" %%% "simple-peer" % "9.11-dt-20220810Z-6e3f61",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
