organization := "org.scalablytyped"
name := "yog2-kernel"
version := "1.9-dt-20191227Z-5dd4d7"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-1b4f69",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20191217Z-b60015",
  "org.scalablytyped" %%% "express" % "4.17-dt-20191101Z-56f2e3",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20191220Z-8b81e3",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20191126Z-7b0fe5",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20191126Z-03061a",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200117Z-4be21b",
  "org.scalablytyped" %%% "node-ral" % "0.18-dt-20181121Z-ae808a",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-b58a9e",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-314389",
  "org.scalablytyped" %%% "std" % "3.7-96076c",
  "org.scalablytyped" %%% "yog-bigpipe" % "0.4-dt-20190819Z-c56c27",
  "org.scalablytyped" %%% "yog-log" % "0.1-dt-20181121Z-1f48f3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        