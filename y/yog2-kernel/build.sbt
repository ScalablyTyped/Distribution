organization := "org.scalablytyped"
name := "yog2-kernel"
version := "1.9-dt-20190312Z-203b97"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-df943a",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-9a5b07",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190819Z-2563ef",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190819Z-c41353",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190827Z-9fa94d",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-612693",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190903Z-da4655",
  "org.scalablytyped" %%% "node-ral" % "0.18-dt-20181121Z-1d2bc1",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-db4fa8",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-7db036",
  "org.scalablytyped" %%% "std" % "3.6-c16502",
  "org.scalablytyped" %%% "yog-bigpipe" % "0.4-dt-20190819Z-b66eb8",
  "org.scalablytyped" %%% "yog-log" % "0.1-dt-20181121Z-c36685")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        