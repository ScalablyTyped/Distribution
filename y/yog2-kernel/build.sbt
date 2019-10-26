organization := "org.scalablytyped"
name := "yog2-kernel"
version := "1.9-dt-20190312Z-b1d27a"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-673836",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-9a66bf",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190819Z-534eff",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20191015Z-5bc067",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20191009Z-45ddf4",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-8e1e66",
  "org.scalablytyped" %%% "node" % "12.11-dt-20191024Z-c10572",
  "org.scalablytyped" %%% "node-ral" % "0.18-dt-20181121Z-65012b",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-c44ea2",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-532a00",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a",
  "org.scalablytyped" %%% "yog-bigpipe" % "0.4-dt-20190819Z-bdea10",
  "org.scalablytyped" %%% "yog-log" % "0.1-dt-20181121Z-505534")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        