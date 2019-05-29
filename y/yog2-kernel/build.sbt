organization := "org.scalablytyped"
name := "yog2-kernel"
version := "1.9-dt-20190312Z-a5bc6b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-bfc0a3",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-468aa7",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-c27d44",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190524Z-c3ce7d",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190523Z-e414eb",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-6731ec",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190528Z-17198b",
  "org.scalablytyped" %%% "node-ral" % "0.18-dt-20181121Z-7c9eec",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-3e1146",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-d55a89",
  "org.scalablytyped" %%% "std" % "3.4-ef47bb",
  "org.scalablytyped" %%% "yog-bigpipe" % "0.4-dt-20180214Z-58129d",
  "org.scalablytyped" %%% "yog-log" % "0.1-dt-20181121Z-0110af")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        