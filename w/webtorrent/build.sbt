organization := "org.scalablytyped"
name := "webtorrent"
version := "0.109-dt-20220103Z-07a927"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bittorrent-protocol" % "3.1-dt-20220101Z-42637e",
  "org.scalablytyped" %%% "magnet-uri" % "5.1-dt-20211202Z-735c77",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221030Z-57fc1b",
  "org.scalablytyped" %%% "parse-torrent" % "5.8-dt-20211202Z-2ac530",
  "org.scalablytyped" %%% "parse-torrent-file" % "4.0-dt-20211202Z-c667fd",
  "org.scalablytyped" %%% "simple-peer" % "9.11-dt-20220810Z-f1fea0",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
