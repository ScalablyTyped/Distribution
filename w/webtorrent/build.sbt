organization := "com.scalablytyped"
name := "webtorrent"
version := "0.98-dt-20180910Z-39b80e"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "bittorrent-protocol" % "2.2-dt-20180910Z-e8f6fd",
  "com.scalablytyped" %%% "magnet-uri" % "5.1-dt-20180910Z-2ed7b5",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181121Z-5a910f",
  "com.scalablytyped" %%% "parse-torrent" % "5.8-dt-20180910Z-f8582b",
  "com.scalablytyped" %%% "parse-torrent-file" % "4.0-dt-20180910Z-3adf46",
  "com.scalablytyped" %%% "simple-peer" % "6.1-dt-20180910Z-ce184f",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        