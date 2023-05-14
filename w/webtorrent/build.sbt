organization := "org.scalablytyped"
name := "webtorrent"
version := "0.109-dt-20220103Z-8a6b96"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bittorrent-protocol" % "3.1-dt-20221230Z-172df0",
  "org.scalablytyped" %%% "magnet-uri" % "5.1-dt-20211202Z-73ef00",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230513Z-b25634",
  "org.scalablytyped" %%% "parse-torrent" % "5.8-dt-20211202Z-de0807",
  "org.scalablytyped" %%% "parse-torrent-file" % "4.0-dt-20211202Z-7ce3bd",
  "org.scalablytyped" %%% "simple-peer" % "9.11-dt-20220810Z-c6cdfa",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
