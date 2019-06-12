organization := "org.scalablytyped"
name := "yar"
version := "9.1-dt-20181111Z-0e7215"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181116Z-8f05d7",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190219Z-24870c",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20190426Z-5356a1",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-907d86",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190414Z-8de623",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-96bb6c",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20190322Z-c8b449",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190611Z-76ef23",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20190322Z-55c3e6",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-df6178",
  "org.scalablytyped" %%% "std" % "3.5-c5d119")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        