organization := "org.scalablytyped"
name := "swagger-node-runner"
version := "0.5-dt-20181022Z-c36eb5"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-ff0790",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181116Z-5d8985",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20181009Z-3531cf",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20181111Z-d70402",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-20e594",
  "org.scalablytyped" %%% "express" % "4.16-dt-20180603Z-b45157",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20180604Z-e60b5f",
  "org.scalablytyped" %%% "hapi" % "17.8-dt-20181212Z-b7075e",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-32ae0c",
  "org.scalablytyped" %%% "joi" % "14.0-dt-20181211Z-62be1d",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180214Z-b5dce1",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20180214Z-3d29af",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20180214Z-576227",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-77ce7e",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20180214Z-00460f",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-5932ee",
  "org.scalablytyped" %%% "restify" % "7.2-dt-20181231Z-cd676d",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-d30fee",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-9b0bee",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20181121Z-716cbc",
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff",
  "org.scalablytyped" %%% "swagger-schema-official" % "2.0-dt-20181113Z-2ed99c")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        