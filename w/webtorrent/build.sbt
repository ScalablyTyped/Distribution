organization := "org.scalablytyped"
name := "webtorrent"
version := "0.107-dt-20200515Z-bc7a21"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bittorrent-protocol" % "3.1-dt-20200515Z-c279b6",
  "org.scalablytyped" %%% "magnet-uri" % "5.1-dt-20200515Z-00d68d",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200521Z-3aabb7",
  "org.scalablytyped" %%% "parse-torrent" % "5.8-dt-20200226Z-2ab795",
  "org.scalablytyped" %%% "parse-torrent-file" % "4.0-dt-20200515Z-590096",
  "org.scalablytyped" %%% "simple-peer" % "9.6-dt-20200515Z-03bc18",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
