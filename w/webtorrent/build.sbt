organization := "org.scalablytyped"
name := "webtorrent"
version := "0.109-dt-20220103Z-12a417"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bittorrent-protocol" % "3.1-dt-20220101Z-98302c",
  "org.scalablytyped" %%% "magnet-uri" % "5.1-dt-20211202Z-304808",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-874609",
  "org.scalablytyped" %%% "parse-torrent" % "5.8-dt-20211202Z-b83ef5",
  "org.scalablytyped" %%% "parse-torrent-file" % "4.0-dt-20211202Z-962cf1",
  "org.scalablytyped" %%% "simple-peer" % "9.11-dt-20220810Z-cec35c",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
