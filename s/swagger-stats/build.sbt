organization := "org.scalablytyped"
name := "swagger-stats"
version := "0.95-dt-20200211Z-16d1e1"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "body-parser" % "1.19-dt-20200210Z-777753",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20200226Z-26d1e9",
  "org.scalablytyped" %%% "express" % "4.17-dt-20200331Z-79bd5c",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20200323Z-88b703",
  "org.scalablytyped" %%% "hapi__boom" % "9.1.0-42a2a0",
  "org.scalablytyped" %%% "hapi__catbox" % "10.2-dt-20190521Z-3bb96a",
  "org.scalablytyped" %%% "hapi__hapi" % "19.0-dt-20200227Z-b8f581",
  "org.scalablytyped" %%% "hapi__iron" % "6.0.0-94df23",
  "org.scalablytyped" %%% "hapi__joi" % "16.0-dt-20200225Z-f77a38",
  "org.scalablytyped" %%% "hapi__mimos" % "4.1-dt-20200330Z-731415",
  "org.scalablytyped" %%% "hapi__podium" % "3.4-dt-20200225Z-739834",
  "org.scalablytyped" %%% "hapi__shot" % "4.1-dt-20190404Z-4de64d",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20191126Z-3b5426",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20200330Z-b5288f",
  "org.scalablytyped" %%% "node" % "13.11-dt-20200402Z-9a87f0",
  "org.scalablytyped" %%% "prom-client" % "11.5.3-782c15",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20200225Z-e66ac9",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-6ae0c0",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20200227Z-e748ee",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
