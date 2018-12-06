organization := "org.scalablytyped"
name := "webtorrent"
version := "0.98-dt-20180910Z-6fe7e3"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bittorrent-protocol" % "2.2-dt-20180910Z-e35a60",
  "org.scalablytyped" %%% "magnet-uri" % "5.1-dt-20180910Z-bb2f0d",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-d9c01e",
  "org.scalablytyped" %%% "parse-torrent" % "5.8-dt-20180910Z-1f4e78",
  "org.scalablytyped" %%% "parse-torrent-file" % "4.0-dt-20180910Z-485ab8",
  "org.scalablytyped" %%% "simple-peer" % "6.1-dt-20180910Z-0af8bf",
  "org.scalablytyped" %%% "std" % "3.2.1-edfe2b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        