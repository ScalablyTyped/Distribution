organization := "org.scalablytyped"
name := "yar"
version := "9.1-dt-20181111Z-b3eb72"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "boom" % "7.3-dt-20190805Z-a9c90d",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190219Z-31857d",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20190426Z-ce1df9",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-fb63f2",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190414Z-22a7d7",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-076342",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20190322Z-c1978b",
  "org.scalablytyped" %%% "node" % "12.7-dt-20191003Z-a35ed6",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20190322Z-6c0f60",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-234b2d",
  "org.scalablytyped" %%% "std" % "3.6-abb6d3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        