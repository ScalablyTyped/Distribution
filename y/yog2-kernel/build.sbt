organization := "org.scalablytyped"
name := "yog2-kernel"
version := "1.9-dt-20190312Z-4f4905"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-fa541b",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-ec1e73",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190604Z-d0e78b",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190606Z-95eecb",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190626Z-4ba0df",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-7c60c5",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190703Z-0260d9",
  "org.scalablytyped" %%% "node-ral" % "0.18-dt-20181121Z-5b4eed",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-eab0d2",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-32f9e0",
  "org.scalablytyped" %%% "std" % "3.5-d4a303",
  "org.scalablytyped" %%% "yog-bigpipe" % "0.4-dt-20180214Z-3fbf92",
  "org.scalablytyped" %%% "yog-log" % "0.1-dt-20181121Z-e9bb0c")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        