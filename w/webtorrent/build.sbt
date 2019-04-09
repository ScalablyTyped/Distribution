organization := "org.scalablytyped"
name := "webtorrent"
version := "0.98-dt-20190212Z-01e3a7"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bittorrent-protocol" % "2.2-dt-20190212Z-a79f38",
  "org.scalablytyped" %%% "magnet-uri" % "5.1-dt-20190212Z-c4d08c",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190408Z-6fa8bf",
  "org.scalablytyped" %%% "parse-torrent" % "5.8-dt-20190212Z-4ddee0",
  "org.scalablytyped" %%% "parse-torrent-file" % "4.0-dt-20190212Z-591bfc",
  "org.scalablytyped" %%% "simple-peer" % "6.1-dt-20180721Z-b97705",
  "org.scalablytyped" %%% "std" % "3.4-d52857")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        