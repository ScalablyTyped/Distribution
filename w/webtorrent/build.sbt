organization := "org.scalablytyped"
name := "webtorrent"
version := "0.107-dt-20200515Z-095eef"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bittorrent-protocol" % "3.1-dt-20200515Z-17ab3a",
  "org.scalablytyped" %%% "magnet-uri" % "5.1-dt-20200515Z-8cca20",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200624Z-2fcd45",
  "org.scalablytyped" %%% "parse-torrent" % "5.8-dt-20200226Z-84450d",
  "org.scalablytyped" %%% "parse-torrent-file" % "4.0-dt-20200515Z-26471d",
  "org.scalablytyped" %%% "simple-peer" % "9.6-dt-20200515Z-c1a331",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
