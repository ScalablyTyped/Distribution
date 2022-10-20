organization := "org.scalablytyped"
name := "webtorrent"
version := "0.109-dt-20220103Z-964229"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bittorrent-protocol" % "3.1-dt-20220101Z-5883f3",
  "org.scalablytyped" %%% "magnet-uri" % "5.1-dt-20211202Z-17f226",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221018Z-1e532a",
  "org.scalablytyped" %%% "parse-torrent" % "5.8-dt-20211202Z-36663a",
  "org.scalablytyped" %%% "parse-torrent-file" % "4.0-dt-20211202Z-3ea558",
  "org.scalablytyped" %%% "simple-peer" % "9.11-dt-20220810Z-cdb4fa",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
