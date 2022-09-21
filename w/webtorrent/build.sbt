organization := "org.scalablytyped"
name := "webtorrent"
version := "0.109-dt-20220103Z-64d0d8"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bittorrent-protocol" % "3.1-dt-20220101Z-b05c5a",
  "org.scalablytyped" %%% "magnet-uri" % "5.1-dt-20211202Z-443eaf",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220913Z-77cc8d",
  "org.scalablytyped" %%% "parse-torrent" % "5.8-dt-20211202Z-f0aecf",
  "org.scalablytyped" %%% "parse-torrent-file" % "4.0-dt-20211202Z-60a94f",
  "org.scalablytyped" %%% "simple-peer" % "9.11-dt-20220810Z-4c62ec",
  "org.scalablytyped" %%% "std" % "4.8-958c79")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
