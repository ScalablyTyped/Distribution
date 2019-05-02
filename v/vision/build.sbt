organization := "org.scalablytyped"
name := "vision"
version := "5.3-dt-20190219Z-52e99b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181116Z-1637e5",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190219Z-1b00d1",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20190426Z-1b83e2",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-1b5b47",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190414Z-536314",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-38d1ba",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20190322Z-ec220e",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190502Z-d681c7",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20190322Z-a87603",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-c8e1eb",
  "org.scalablytyped" %%% "std" % "3.4-495f93")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        