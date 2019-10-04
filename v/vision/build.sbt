organization := "org.scalablytyped"
name := "vision"
version := "5.3-dt-20190219Z-5c83a8"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "boom" % "7.3-dt-20190805Z-a8883d",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190219Z-9bb8d3",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20190426Z-8eca11",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-1673fc",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190414Z-aeaeee",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-2b791f",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20190322Z-fef82d",
  "org.scalablytyped" %%% "node" % "12.7-dt-20191003Z-e91184",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20190322Z-77c72d",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-c80101",
  "org.scalablytyped" %%% "std" % "3.6-c16502")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        