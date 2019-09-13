organization := "org.scalablytyped"
name := "typed-github-api"
version := "1.2.6-f3bd26"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-8ff114",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-090bd5",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190819Z-915bef",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190819Z-48acfb",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-612693",
  "org.scalablytyped" %%% "moment" % "2.24.0-4e4a5b",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190911Z-da4655",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-db4fa8",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-4181d6",
  "org.scalablytyped" %%% "std" % "3.6-c16502",
  "org.scalablytyped" %%% "typescript-event-handler" % "1.0.0-93a00c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        