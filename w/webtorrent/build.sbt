organization := "org.scalablytyped"
name := "webtorrent"
version := "0.109-dt-20220103Z-f14e6c"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bittorrent-protocol" % "3.1-dt-20220101Z-778202",
  "org.scalablytyped" %%% "magnet-uri" % "5.1-dt-20211202Z-760c40",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221015Z-0a42ca",
  "org.scalablytyped" %%% "parse-torrent" % "5.8-dt-20211202Z-26d0fe",
  "org.scalablytyped" %%% "parse-torrent-file" % "4.0-dt-20211202Z-3500ca",
  "org.scalablytyped" %%% "simple-peer" % "9.11-dt-20220810Z-dda48d",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
