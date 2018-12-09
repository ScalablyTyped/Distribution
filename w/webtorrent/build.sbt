organization := "org.scalablytyped"
name := "webtorrent"
version := "0.98-dt-20180910Z-4dd40d"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bittorrent-protocol" % "2.2-dt-20180910Z-3337b1",
  "org.scalablytyped" %%% "magnet-uri" % "5.1-dt-20180910Z-d725b7",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-df5d12",
  "org.scalablytyped" %%% "parse-torrent" % "5.8-dt-20180910Z-3bdc69",
  "org.scalablytyped" %%% "parse-torrent-file" % "4.0-dt-20180910Z-f5c2fd",
  "org.scalablytyped" %%% "simple-peer" % "6.1-dt-20180910Z-e2fd1a",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        