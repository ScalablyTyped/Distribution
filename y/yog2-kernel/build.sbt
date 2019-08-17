organization := "org.scalablytyped"
name := "yog2-kernel"
version := "1.9-dt-20190312Z-a1f59f"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-0f462b",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-8e708a",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190816Z-515e7b",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190816Z-71409c",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190816Z-cbbb3c",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-c877f7",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190815Z-2dc4df",
  "org.scalablytyped" %%% "node-ral" % "0.18-dt-20181121Z-c3a25e",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-b87c0a",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-55674a",
  "org.scalablytyped" %%% "std" % "3.5-cd493c",
  "org.scalablytyped" %%% "yog-bigpipe" % "0.4-dt-20180214Z-019cee",
  "org.scalablytyped" %%% "yog-log" % "0.1-dt-20181121Z-0b52fa")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        