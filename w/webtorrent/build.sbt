organization := "com.scalablytyped"
name := "webtorrent"
version := "0.98-dt-20180910Z-f24cae"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "bittorrent-protocol" % "2.2-dt-20180910Z-cbafd3",
  "com.scalablytyped" %%% "magnet-uri" % "5.1-dt-20180910Z-2b2944",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181129Z-9f7a18",
  "com.scalablytyped" %%% "parse-torrent" % "5.8-dt-20180910Z-f38f90",
  "com.scalablytyped" %%% "parse-torrent-file" % "4.0-dt-20180910Z-cecde2",
  "com.scalablytyped" %%% "simple-peer" % "6.1-dt-20180910Z-953234",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        