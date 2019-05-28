organization := "org.scalablytyped"
name := "yog2-kernel"
version := "1.9-dt-20190312Z-8bcf7a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-732eb4",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-1699d9",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-448e20",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190524Z-e586f1",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190523Z-ccc546",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-169399",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190517Z-1fb914",
  "org.scalablytyped" %%% "node-ral" % "0.18-dt-20181121Z-c5daad",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-acf35f",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-1e3fd2",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2",
  "org.scalablytyped" %%% "yog-bigpipe" % "0.4-dt-20180214Z-2068c1",
  "org.scalablytyped" %%% "yog-log" % "0.1-dt-20181121Z-f79e17")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        